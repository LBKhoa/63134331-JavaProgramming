/**
 * 
 */
package ntu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 
 */
class SanPham {
    String ten;
    Double donGia;

    public SanPham(String ten, Double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }
}
public class Lab5Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> productList = new ArrayList<>();

        while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Kết thúc");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    System.out.println("Nhập danh sách sản phẩm:");
                    while (true) {
                        System.out.print("Nhập tên sản phẩm (nhập 'done' để kết thúc): ");
                        String ten = scanner.nextLine();
                        if (ten.equalsIgnoreCase("done")) {
                            break;
                        }
                        System.out.print("Nhập giá sản phẩm: ");
                        Double gia = scanner.nextDouble();
                        scanner.nextLine(); // Đọc bỏ dòng trống
                        SanPham product = new SanPham(ten, gia);
                        productList.add(product);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
                    Comparator<SanPham> comp = new Comparator<SanPham>() {
                        @Override
                        public int compare(SanPham o1, SanPham o2) {
                            return o2.donGia.compareTo(o1.donGia);
                        }
                    };
                    Collections.sort(productList, comp);
                    for (SanPham product : productList) {
                        System.out.println(product.ten + " - " + product.donGia);
                    }
                    break;
                case 3:
                    System.out.print("Nhập tên sản phẩm cần xóa: ");
                    String tenXoa = scanner.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).ten.equalsIgnoreCase(tenXoa)) {
                            productList.remove(i);
                            removed = true;
                            break;
                        }
                    }
                    if (removed) {
                        System.out.println("Đã xóa sản phẩm '" + tenXoa + "' thành công.");
                    } else {
                        System.out.println("Không tìm thấy sản phẩm '" + tenXoa + "' trong danh sách.");
                    }
                    break;
                case 4:
                    double total = 0;
                    for (SanPham product : productList) {
                        total += product.donGia;
                    }
                    double average = total / productList.size();
                    System.out.println("Giá trung bình của các sản phẩm: " + average);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
	}

}

