/**
 * 
 */
package ntu;
import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 */
public class Lab3Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// nhap
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng");
		int n = scanner.nextInt();
		
		// khai bao bien mang
		int[] arr = new int[n];
		
		// nhap mang tu ban phim
		System.out.println("Nhập các phần tử của mảng: ");
		for(int i = 0; i < n; i++) {
			System.out.print("Phần tử thứ "+ (i + 1)+":");
			arr[i] = scanner.nextInt();
		}
		//sap xep va xuat mang
		Arrays.sort(arr);
		System.out.println("Mảng sau khi sắp xếp: "+ Arrays.toString(arr));
		
		//Tim va xuat phan tu nho nhat
		int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);
        
        // tinh va xuat trung binh cong cac phan tu chia het cho 3
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                tong += arr[i];
                dem++;
            }
        }
        double trungBinhCong = dem == 0 ? 0 : (double) tong / dem;
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + trungBinhCong);
	}

}
