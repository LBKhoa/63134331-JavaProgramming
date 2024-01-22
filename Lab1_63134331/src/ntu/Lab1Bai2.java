/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// khai bao bien
		double dai, rong, chuVi, dienTich, canhNhoNhat;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài của hình chữ nhật: ");
		dai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng của hình chữ nhật:");
		rong = scanner.nextDouble();
		
		
		// tinh chu vi hinh chư nhat, dien tich, canh nho nhat
		chuVi = (dai + rong)*2;
		dienTich = dai * rong;
		canhNhoNhat = Math.min(dai,rong);
		
		//xuat ket qua
		System.out.println("Chu vi hình chữ nhật là: " + chuVi);
		System.out.println("Diện tích hình chữ nhật là: " + dienTich);
		System.out.println("Cạnh nhỏ nhất hình chữ nhật là: " + canhNhoNhat);
	}

}
