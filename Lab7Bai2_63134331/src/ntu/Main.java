package ntu;

public class Main {
    public static void main(String[] args) {
        SinhVienPoly sinhVienIT = new SinhVienIT("Nguyen Van A", "IT", 8, 7, 9);
        SinhVienPoly sinhVienBiz = new SinhVienBiz("Nguyen Van B", "Biz", 7, 8);

        System.out.println("Thông tin sinh viên IT:");
        sinhVienIT.xuat();

        System.out.println();

        System.out.println("Thông tin sinh viên Biz:");
        sinhVienBiz.xuat();
    }
}

