/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab3Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Nhap so nguyen tu ban phim
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập một số nguyên: ");
		int N = scanner.nextInt();
		
		//kiem tra xem N có phai la so nguyen to hay khong
		boolean ok = true;
		if(N < 2) {
			ok = false; // so nho hon 2 khong phai la so nguyen to
		}else {
			for(int i = 2;i <= Math.sqrt(N);i++) {
				if(N % i == 0) {
					ok = false;
					break;
				}
			}
		}
		
		if(ok) {
			System.out.println(N + " là số nguyên tố.");
		}else {
			System.out.println(N + "không phải là số nguyên tố.");
		}
	}

}
