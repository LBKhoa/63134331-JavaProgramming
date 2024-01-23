/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// nhap a và b tu ban phim
		Scanner banPhim = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a: ");
		double a = banPhim.nextDouble();
		
		System.out.print("Nhập hệ số b: ");
		double b = banPhim.nextDouble();
		
		// chuong trinh
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			}else {
				System.out.println("Phương trình vô nghiệm");
			}
		}else {
			double x = -b/a;
			System.out.println("Nghiệm của chương trình là: " + x);
		}
	}
}
