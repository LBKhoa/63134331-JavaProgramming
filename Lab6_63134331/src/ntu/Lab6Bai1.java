/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab6Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        
        int indexHo = hoTen.indexOf(' ');
        int indexTen = hoTen.lastIndexOf(' ');
        
        String ho = hoTen.substring(0, indexHo).toUpperCase();
        String tenDem = hoTen.substring(indexHo + 1, indexTen).toLowerCase();
        String ten = hoTen.substring(indexTen + 1).toUpperCase();
        
        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);		
	}

}

