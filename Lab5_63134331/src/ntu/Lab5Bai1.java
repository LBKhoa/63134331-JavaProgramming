/**
 * 
 */
package ntu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 */
public class Lab5Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        
        System.out.println("Nhập danh sách số thực:");
        while (true) {
            Double x = scanner.nextDouble();
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        
        System.out.println("Danh sách vừa nhập:");
        for (Double num : list) {
            System.out.println(num);
        }
        
        double sum = 0;
        for (Double num : list) {
            sum += num;
        }
        
        System.out.println("Tổng của danh sách: " + sum);

	}

}


