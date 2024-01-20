/**
 * 
 */
package ntu;

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai1 {

	public static void main(String[] args) {

		Scanner banPhim = new Scanner(System.in);
		System.out.print("Ho và Tên: ");
		String hoTen = banPhim.nextLine();
		
		System.out.print("Điểm TB: ");
		double diemTB = banPhim.nextDouble();
		System.out.printf("%s %.2f điểm", hoTen, diemTB);
	}

}
