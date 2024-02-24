/**
 * 
 */
package ntu;
import java.util.Scanner;

/**
 * 
 */
public class SanPham3 {
	// Khai báo các trường dữ liệu với đặc tả truy xuất private
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Hàm tạo với đầy đủ tham số
    public SanPham3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Hàm tạo với hai tham số (ngầm hiểu không giảm giá)
    public SanPham3(String tenSp, double donGia) {
        this(tenSp, donGia, 0); // Gọi hàm tạo có đầy đủ tham số
    }

    // Phương thức tính thuế nhập khẩu (private)
    private double getThueNhapKhau() {
        return 0.1 * donGia; // 10% giá sản phẩm
    }
    
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

    // Phương thức xuất thông tin sản phẩm ra màn hình (public)
    public void xuat() {
        System.out.println("Thông tin sản phẩm:");
        System.out.println("Tên sản phẩm: " + getTenSp());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Giảm giá: " + getGiamGia());
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    // Getter và setter cho các trường dữ liệu
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Tạo sản phẩm có giảm giá
        SanPham3 sp1 = new SanPham3("Sản phẩm A", 100, 20);

        // Tạo sản phẩm không có giảm giá
        SanPham3 sp2 = new SanPham3("Sản phẩm B", 150);

        // Xuất thông tin sản phẩm ra màn hình
        System.out.println("Thông tin sản phẩm thứ nhất:");
        sp1.nhap();
        sp1.xuat();

        System.out.println("\nThông tin sản phẩm thứ hai:");
        sp2.nhap();
        sp2.xuat();
	}

}
