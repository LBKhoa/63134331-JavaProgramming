/**
 * 
 */
package ntu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 */
class SanPham {
    String tenSp;
    double donGia;
    String hang;

    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Hãng: " + hang);
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhập hãng: ");
        hang = scanner.nextLine();
    }
}

public class Lab6Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin cho 5 sản phẩm:");
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham("", 0, "");
            sp.nhap();
            danhSachSanPham.add(sp);
        }

        System.out.println("\nThông tin các sản phẩm có hãng là Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
                System.out.println();
            }
        }
	}

}

