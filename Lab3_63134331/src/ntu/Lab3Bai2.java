/**
 * 
 */
package ntu;

/**
 * 
 */
public class Lab3Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Xuat ban cuu chuong tu 1 den 9
		for(int i = 1; i <= 9; i++) {
			System.out.println("Bảng cửu chương " + i + ":");
			System.out.println("-----------------------------");
			
			// xuat cac phep nhan trong ban cuu chuong
			for(int j = 1; j <= 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			
			System.out.println("----------------------------\n");
		}
	}

}
