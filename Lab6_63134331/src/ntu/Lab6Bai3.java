/**
 * 
 */
package ntu;
import java.util.Scanner;
/**
 * 
 */
class SinhVien {
    String hoTen;
    String email;
    String soDienThoai;
    String cmnd;

    public SinhVien(String hoTen, String email, String soDienThoai, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.cmnd = cmnd;
    }

    public void hienThi() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("CMND: " + cmnd);
    }

    public static boolean kiemTraEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regex);
    }

    public static boolean kiemTraSoDienThoai(String soDienThoai) {
        String regex = "^\\d{10}$";
        return soDienThoai.matches(regex);
    }

    public static boolean kiemTraCMND(String cmnd) {
        String regex = "^\\d{9}$";
        return cmnd.matches(regex);
    }
}
public class Lab6Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        SinhVien[] danhSachSinhVien = new SinhVien[5];

        System.out.println("Nhập thông tin cho 5 sinh viên:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            while (!SinhVien.kiemTraEmail(email)) {
                System.out.println("Email không đúng định dạng. Vui lòng nhập lại.");
                System.out.print("Email: ");
                email = scanner.nextLine();
            }
            System.out.print("Số điện thoại: ");
            String soDienThoai = scanner.nextLine();
            while (!SinhVien.kiemTraSoDienThoai(soDienThoai)) {
                System.out.println("Số điện thoại không đúng định dạng. Vui lòng nhập lại.");
                System.out.print("Số điện thoại: ");
                soDienThoai = scanner.nextLine();
            }
            System.out.print("CMND: ");
            String cmnd = scanner.nextLine();
            while (!SinhVien.kiemTraCMND(cmnd)) {
                System.out.println("CMND không đúng định dạng. Vui lòng nhập lại.");
                System.out.print("CMND: ");
                cmnd = scanner.nextLine();
            }

            danhSachSinhVien[i] = new SinhVien(hoTen, email, soDienThoai, cmnd);
        }

        System.out.println("\nThông tin các sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.hienThi();
            System.out.println();
        }
	}

}


