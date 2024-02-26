/**
 * 
 */
package ntu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 */
public class Lab5Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    System.out.println("Nhập danh sách họ và tên:");
                    while (true) {
                        System.out.print("Nhập họ và tên (nhập 'done' để kết thúc): ");
                        String name = scanner.nextLine();
                        if (name.equalsIgnoreCase("done")) {
                            break;
                        }
                        nameList.add(name);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách họ và tên vừa nhập:");
                    for (String name : nameList) {
                        System.out.println(name);
                    }
                    break;
                case 3:
                    System.out.println("Danh sách họ và tên ngẫu nhiên:");
                    Collections.shuffle(nameList);
                    for (String name : nameList) {
                        System.out.println(name);
                    }
                    break;
                case 4:
                    System.out.println("Danh sách họ và tên được sắp xếp giảm dần:");
                    Collections.sort(nameList);
                    Collections.reverse(nameList);
                    for (String name : nameList) {
                        System.out.println(name);
                    }
                    break;
                case 5:
                    System.out.print("Nhập họ và tên cần xóa: ");
                    String nameToRemove = scanner.nextLine();
                    boolean removed = nameList.remove(nameToRemove);
                    if (removed) {
                        System.out.println("Đã xóa '" + nameToRemove + "' thành công.");
                    } else {
                        System.out.println("'" + nameToRemove + "' không tồn tại trong danh sách.");
                    }
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
	}

}
