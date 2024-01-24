/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai bao bien
		int luaChon;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			menu();
			System.out.print("Chon chức năng: ");
			luaChon = scanner.nextInt();
			
			switch(luaChon) {
				case 1:
					giaiPTB1();
					break;
				case 2:
					giaiPTB2();
					break;
				case 3:
					tinhTienDien();
					break;
				case 4:
					System.out.printf("Kết thúc.");
					break;
				default:
					System.out.println("Chức năng không hợp lệ ! Vui lòng chọn lại.");
			}
		}while(luaChon != 4);
		
	}
	public static void menu() {
		System.out.println("+------------------------------+");
		System.out.println("1:Giải phương trình bậc nhất.");
		System.out.println("2:Giải phương trình bậc 2.");
		System.out.println("3:Tính tiền điện.");
		System.out.println("4:Kết thúc.");
		System.out.println("+------------------------------+");
	}
	
	public static void giaiPTB1() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		
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
	
	public static void giaiPTB2() {
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
	
	public static void tinhTienDien() {
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
