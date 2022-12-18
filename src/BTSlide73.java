import java.util.Scanner;

public class BTSlide73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loaiGrab = nhapLoaiGrab(scanner);
        double soKm = nhapQuangDuong(scanner);
        int thoiGianCho = nhapThoiGianCho(scanner);

        double tongTien = tinhTongTien(loaiGrab, soKm, thoiGianCho);
        System.out.println("Tổng tiền là: " + tongTien);

    }

    public static int nhapLoaiGrab(Scanner scanner) {
        System.out.println("Nhập loại grab: ");
        System.out.println("1. GRAB CAR");
        System.out.println("2. GRAB SUV");
        System.out.println("3. GRAB BLACK");
        int luaChon = scanner.nextInt();
        while (true) {
            if(luaChon >= 1 && luaChon <= 3) break;
            else {
                System.out.println("Vui lòng chọn lại loại grab cho phép: ");
                luaChon = scanner.nextInt();
            }
        }
        return luaChon;
    }

    public static double nhapQuangDuong(Scanner scanner) {
        System.out.println("Nhập vào số km đi được: ");
        double soKm = scanner.nextDouble();
        while (true) {
            if(soKm > 0) break;
            else {
                System.out.println("Vui lòng nhập lại số km đi được (số km > 0): ");
                soKm = scanner.nextDouble();
            }
        }
        return soKm;
    }

    public static int nhapThoiGianCho(Scanner scanner) {
        System.out.println("Nhập vào thời gian chờ: ");
        int thoiGianCho = scanner.nextInt();
        while (true) {
            if(thoiGianCho >= 0) break;
            else {
                System.out.println("Vui lòng nhập lại thời gian chờ (thời gian chờ >= 0");
                thoiGianCho = scanner.nextInt();
            }
        }
        return thoiGianCho;
    }

    public static double tinhTongTien(int loaiGrab, double soKm, int thoiGianCho) {
        double tongTien = 0;

        switch (loaiGrab) {
            case 1:
                if(soKm > 0 && soKm < 1) {
                    tongTien += (8000 + (thoiGianCho / 3) * 2000);
                } else if (soKm < 19) {
                    tongTien += (8000 + (soKm - 1) * 7500 + (thoiGianCho / 3) * 2000);
                } else {
                    tongTien += (8000 + 18 * 7500 + (soKm - 19) * 7000 + (thoiGianCho / 3) * 2000);
                }
                break;
            case 2:
                if(soKm > 0 && soKm < 1) {
                    tongTien += (9000 + (thoiGianCho / 3) * 3000);
                } else if (soKm < 19) {
                    tongTien += (9000 + (soKm - 1) * 8500 + (thoiGianCho / 3) * 3000);
                } else {
                    tongTien += (9000 + 18 * 8500 + (soKm - 19) * 8000 + (thoiGianCho / 3) * 3000);
                }
                break;
            case 3:
                if(soKm > 0 && soKm < 1) {
                    tongTien += (10000 + (thoiGianCho / 3) * 3500);
                } else if (soKm < 19) {
                    tongTien += (10000 + (soKm - 1) * 9500 + (thoiGianCho / 3) * 3500);
                } else {
                    tongTien += (10000 + 18 * 9500 + (soKm - 19) * 9000 + (thoiGianCho / 3) * 3500);
                }
                break;
        }

        return tongTien;
    }
}
