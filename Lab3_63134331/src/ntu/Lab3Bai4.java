/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
public class Lab3Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		
		// nhap so luong sinh vien
		System.out.printf("Nhập số lượng sinh viên: ");
		int n = scanner.nextInt();
		
		// khai bao mang ho ten va diem cua sinh vien
		String[] hoTen = new String[n];
		double[] diem = new double[n];
		String[] hocLuc = new String[n];
		
		// nhap thong tin cua sinh vien
		for(int i = 0; i < n;i++) {
			scanner.nextLine();//doc bo ky tu xuong dong sau khi nhap so luong sinh vien
			System.out.println("Nhập thông tin sinh viên thứ " + (i+1)+ ": ");
			System.out.print("Họ và tên: ");
			hoTen[i]= scanner.nextLine();
			System.out.print("Điểm: ");
			diem[i] = scanner.nextDouble();
			
			//xac dinh hoc luc cua sinh vien
			if(diem[i]<5) {
				hocLuc[i]="Yếu";
			}else if(diem[i]<6.5) {
				hocLuc[i]="Trung bình";
			}else if(diem[i]<7.5) {
				hocLuc[i]="Khá";
			}else if(diem[i]<9) {
				hocLuc[i]="Giỏi";
			}else {
				hocLuc[i]="Xuất sắc";
			}
		}
		
		//xuat thong tin cua sinh vien
		System.out.println("\nThông tin của sinh viên:");
		for(int i = 0;i < n; i++) {
			System.out.println("Sinh viên " + (i+1) +":");
			System.out.println("Họ tên: "+ hoTen[i]);
			System.out.println("Điểm: "+diem[i]);
			System.out.println("Học lực: "+hocLuc[i]);
			System.out.println();
		}
		
		// sắp xếp danh sách sinh viên theo điểm 
		for(int i = 0; i< n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(diem[i] > diem[j]) {
					// hoán đổi thông tin sinh viên
					String tempHoTen = hoTen[i];
					hoTen[i] = hoTen[j];
					hoTen[j] = tempHoTen;
					
					double tempDiem = diem[i];
					diem[i] = diem [j];
					diem[j] = tempDiem;
					
					String tempHocLuc = hocLuc[i];
					hocLuc[i] = hocLuc[j];
					hocLuc[j] = tempHocLuc;
				}
			}
		}
		//xuat danh sach sinh vien sau khi sap xep
		System.out.println("\nDanh sách sinh viên sau khi sắp xếp điểm: ");
		for(int i = 0;i < n ;i++) {
			System.out.println("Sinh viên " +(i+1)+":");
			System.out.println("Họ và tên: "+hoTen[i]);
			System.out.println("Điểm: "+ diem[i]);
			System.out.println("Học lực: "+hocLuc[i]);
			System.out.println();
		}
	}

}
