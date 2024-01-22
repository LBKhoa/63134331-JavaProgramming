/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai bao bien
		double a, b, c, delta;
		
		//Nhap cac he so a b c tu ban phim
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhâp a: ");
		a = scanner.nextDouble();
		System.out.print("Nhâp b: ");
		b = scanner.nextDouble();
		System.out.print("Nhâp c: ");
		c = scanner.nextDouble();
		
		//Tinh delta
		delta = Math.pow(b, 2)- 4 * a * c;
		
		//kiem tra delta va xuat ra man hinh
		if(delta < 0) {
			System.out.println("Phương trình không có nghiệm thực!");
		}else {
			double canDelta = Math.sqrt(delta);
			System.out.println("Căn delta của chương trình là: " + canDelta);
		}
	}

}
