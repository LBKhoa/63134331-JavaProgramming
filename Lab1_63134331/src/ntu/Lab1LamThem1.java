/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1LamThem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao bien
		double banKinh, duongKinh, dienTich, chuVi;
		
		//nhap vao ban kinh hinh tron
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhâp bán kính hình tròn: ");
		banKinh = scanner.nextDouble();
		
		// tinh toan duong kinh, dien tich, chu vi hinh tron
		duongKinh = banKinh * 2;
		dienTich = Math.PI * Math.pow(banKinh, 2);
		chuVi = 2 * Math.PI * banKinh;
		
		// xuat ket qua
		System.out.println("Đường kính hình tròn là: " + duongKinh);
		System.out.println("Diện tích hình tròn là: " + dienTich);
		System.out.println("Chu vi hình tròn là: " + chuVi);
	}

}
