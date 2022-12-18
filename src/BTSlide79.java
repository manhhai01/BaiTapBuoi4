import java.util.Scanner;

public class BTSlide79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hoTen = nhapHoTen(scanner);
        double tongThuNhapNam = nhapTongThuNhapNam(scanner);
        int soNguoiPhuThuoc = nhapSoNguoiPhuThuoc(scanner);

        double tienThue = tinhThue(tongThuNhapNam, soNguoiPhuThuoc);
        if(tienThue == 0) System.out.println(hoTen + " không phải đóng thuế thu nhâp cá nhân");
        else System.out.println(hoTen + " đóng thuế thu nhập cá nhân là: " + tienThue);

    }

    public static String nhapHoTen(Scanner scanner) {
        System.out.println("Nhập vào họ tên cá nhân: ");
        String hoTen = scanner.nextLine();
        while (true) {
            if(!hoTen.equals("")) break;
            else {
                System.out.println("Nhập lại họ tên (không đươc bỏ trống): ");
                hoTen = scanner.nextLine();
            }
        }
        return hoTen;
    }

    public static double nhapTongThuNhapNam(Scanner scanner) {
        System.out.println("Nhập tổng thu nhập năm: ");
        double tongThuNhapNam = scanner.nextDouble();
        while (true) {
            if(tongThuNhapNam >= 0) break;
            else {
                System.out.println("Nhập lại tổng thu nhập năm (tổng thu nhập năm >= 0");
                tongThuNhapNam = scanner.nextDouble();
            }
        }
        return tongThuNhapNam;
    }

    public static int nhapSoNguoiPhuThuoc(Scanner scanner) {
        System.out.println("Nhập số người phụ thuộc: ");
        int soNguoiPhuThuoc = scanner.nextInt();
        while (true) {
            if(soNguoiPhuThuoc >= 0) break;
            else {
                System.out.println("Nhập lại số người phụ thuộc (số người phụ thuộc >= 0): ");
                soNguoiPhuThuoc = scanner.nextInt();
            }
        }
        return soNguoiPhuThuoc;
    }

    public static double tinhThue(double tongThuNhapNam, int soNguoiPhuThuoc) {
        double thue = 0;
        double thuNhapChiuThue = tongThuNhapNam - 4000000 - soNguoiPhuThuoc * 1600000;

        thue += thuNhapChiuThue > 0 ? thuNhapChiuThue*5/100 : 0;
        thue += thuNhapChiuThue > 60000000 ? (thuNhapChiuThue - 60000000)*10/100 : 0 ;
        thue += thuNhapChiuThue > 120000000 ? (thuNhapChiuThue - 120000000)*15/100 : 0 ;
        thue += thuNhapChiuThue > 210000000 ? (thuNhapChiuThue - 210000000)*20/100 : 0 ;
        thue += thuNhapChiuThue > 384000000 ? (thuNhapChiuThue - 384000000)*25/100 : 0 ;
        thue += thuNhapChiuThue > 624000000 ? (thuNhapChiuThue - 624000000)*30/100 : 0 ;
        thue += thuNhapChiuThue > 960000000 ? (thuNhapChiuThue - 960000000)*35/100 : 0 ;

        return thue;
    }
}
