/**
 * 
 */
package ntu;
import java.util.Scanner;

public class SanPham {
    // Khai báo các thuộc tính của lớp
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Constructor mặc định
    public SanPham() {
        this.tenSp = "Áo thun";
        this.donGia = 100;
        this.giamGia = 20;
    }

    // Phương thức tính thuế nhập khẩu
    public double getThueNhapKhau() {
        return 0.1 * donGia; // 10% giá sản phẩm
    }

    // Phương thức xuất thông tin sản phẩm ra màn hình
    public void xuat() {
        System.out.println("Thông tin sản phẩm:");
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    // Phương thức nhập thông tin sản phẩm từ bàn phím
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sản phẩm:");
        System.out.print("Tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Giảm giá: ");
        giamGia = scanner.nextDouble();
    }

    // Phương thức main để kiểm tra lớp SanPham
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        sp1.xuat();

        // Nhập thông tin sản phẩm từ bàn phím và xuất ra màn hình
        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();
    }
}