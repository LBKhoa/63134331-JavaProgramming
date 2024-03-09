package ntu;

import java.util.ArrayList;
import java.util.Scanner;

public class Nhap {
    private ArrayList<SinhVien> danhSach = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void nhapDanhSach(ArrayList<SinhVien> danhSach) {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Điểm: ");
            double diem = scanner.nextDouble();
            scanner.nextLine(); // Clear buffer

            SinhVien sv = new SinhVien(hoTen, diem);
            danhSach.add(sv);
        }
    }
}

