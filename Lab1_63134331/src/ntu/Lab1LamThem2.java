/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1LamThem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao bien
		int n, tong = 0;
		
		//nhap so nguyen duong n tu ban phim
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhập một số nguyên dương n: ");
			n = scanner.nextInt();
			
		}while (n<=0);
		
		//Tinh tong cac so tu 1 den n
		for(int i = 1; i <= n; i++) {
			tong +=i;// tong = tong + i;
		}
		
		//xuat ket qua
		System.out.println("Tổng của các số từ 1 đến " + n + " là: " + tong);
	}

}
