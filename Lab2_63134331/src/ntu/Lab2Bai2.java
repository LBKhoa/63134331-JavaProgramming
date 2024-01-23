/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai bao bien
		double a, b, c;
		
		// nhap he so a, b tu ban phim
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		c = scanner.nextDouble();
		
		//kiem tra gia tri cua a và b
		if(a == 0) {
			// neu a = 0 thi giai phuong trinh bat nhat
			if(b == 0) {
				if(c == 0) {
					System.out.println("Phương trình có vô số nghiệm");
				}else {
					System.out.println("Phương trình vô nghiệm");
				}
			}else {
				double x = -c/b;
				System.out.println("Nghiệm của phương trình là " + x);
			}
		}else {
			// nguoc lai, giai phuong trinh bac hai
			double delta = b*b - 4*a*c;
			
			if(delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			}else if (delta == 0) {
				double x = -b / (2*a);
				System.out.println("Nghiệm kép của phương trình là: " + x);
			}else {
				double x1 = (-b + Math.sqrt(delta)) / (2*a);
				double x2 = (-b - Math.sqrt(delta)) / (2*a);
				System.out.println("Nghiệm của phương trình là: x1 = " + x1 + " , x2 = " + x2);
			}
		}
	}

}
