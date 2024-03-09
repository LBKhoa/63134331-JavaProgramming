package ntu;
import java.util.Scanner;

public class Lab7Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập chiều dài hình chữ nhật: ");
	        double daiCN = scanner.nextDouble();
	        System.out.print("Nhập chiều rộng hình chữ nhật: ");
	        double rongCN = scanner.nextDouble();
	        System.out.print("Nhập cạnh hình vuông: ");
	        double canhVuong = scanner.nextDouble();

	        ChuNhat cn = new ChuNhat(daiCN, rongCN);
	        ChuNhat vu = new Vuong(canhVuong);

	        System.out.println("Thông tin hình chữ nhật:");
	        cn.xuat();
	        System.out.println("Thông tin hình vuông:");
	        vu.xuat();

	        scanner.close();
	}
	
}
