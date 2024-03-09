package ntu;

import java.util.ArrayList;

public class Xuat {
    private ArrayList<SinhVien> danhSach;

    public Xuat(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void xuatDanhSach(ArrayList<SinhVien> danhSach) {
        System.out.println("Danh sách sinh viên:");
        for (SinhVien sv : danhSach) {
            System.out.println("Họ tên: " + sv.getHoTen() + ", Điểm: " + sv.getDiem());
        }
    }
}



