/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao bien
		double canh, theTich1, theTich2;
		
		//nhap canh khoi lap phuong
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập độ dài cạnh của khối lập phương: ");
		canh = scanner.nextDouble();
		
		//tinh the tich khoi lap phuong
		theTich1 = canh*canh*canh;
		theTich2 = Math.pow(canh, 3);
		
		//Xuat ket qua
		System.out.println("Thể tích của khối lập phương theo cách 1 là: " + theTich1);
		System.out.println("Thể tích của khối lập phương theo cách 2 là: " + theTich2);
	}

}
