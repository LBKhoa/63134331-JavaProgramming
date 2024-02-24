/**
 * 
 */
package ntu;

import java.util.Scanner;

/**
 * 
 */
public class Lab4Bai2 {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo 2 đối tượng sản phẩm
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        // Nhập thông tin sản phẩm từ bàn phím
        System.out.println("Nhập thông tin sản phẩm thứ nhất:");
        sp1.nhap();
        System.out.println("\nNhập thông tin sản phẩm thứ hai:");
        sp2.nhap();

        // Xuất thông tin sản phẩm ra màn hình
        System.out.println("\nThông tin sản phẩm thứ nhất:");
        sp1.xuat();
        System.out.println("\nThông tin sản phẩm thứ hai:");
        sp2.xuat();
	}

}
