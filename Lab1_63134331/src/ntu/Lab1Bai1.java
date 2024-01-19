/**
 * 
 */
package util;

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ho và Tên: ");
		String hoTen = Scanner.nextLine();
		
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		System.out.printf("%s %f điểm", hoTen, diemTB);
	}

}
