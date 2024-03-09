package ntu;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    private Nhap nhap;
    private Xuat xuat;
    private SVGioi svGioi;
    private SapXep sapXep;
    private ArrayList<SinhVien> danhSach = new ArrayList<>();

    public Menu() {
        nhap = new Nhap();
        xuat = new Xuat(danhSach);
        svGioi = new SVGioi(danhSach);
        sapXep = new SapXep(danhSach);
    }

    public int hienMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------ MENU ------");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Xuất thông tin danh sách sinh viên");
        System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
        System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
        System.out.println("5. Kết thúc");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();
        return choice;
    }

    public void thucHien(int choice) {
        switch (choice) {
            case 1:
                nhap.nhapDanhSach(danhSach);
                break;
            case 2:
                xuat.xuatDanhSach(danhSach);
                break;
            case 3:
                svGioi.xuatSinhVienGioi(danhSach);
                break;
            case 4:
                sapXep.sapXepTheoDiem(danhSach);
                break;
            case 5:
                System.out.println("Kết thúc chương trình.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
        }
    }
}

