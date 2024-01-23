/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao bien
		int soDien;
		double tien;
		
		// nhap so dien su dung tu ban phim
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng trong tháng: ");
		soDien = scanner.nextInt();
		
		//Tinh tien dien theo phuong phap tich luy tien
		
		if(soDien <= 50) {
			tien = soDien * 1000;
		}else {
			tien = 50 * 1000 + (soDien - 50) * 1200;
		}
		// xuat ket qua
		System.out.println("Tiền điện phải thanh toán là: " + tien + " VND");
	}

}
