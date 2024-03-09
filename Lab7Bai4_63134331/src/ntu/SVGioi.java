package ntu;

import java.util.ArrayList;

public class SVGioi {
    private ArrayList<SinhVien> danhSach;

    public SVGioi(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void xuatSinhVienGioi(ArrayList<SinhVien> danhSach) {
        System.out.println("Danh sách sinh viên có học lực giỏi:");
        for (SinhVien sv : danhSach) {
            if (sv.getDiem() >= 7.5) {
                System.out.println("Họ tên: " + sv.getHoTen() + ", Điểm: " + sv.getDiem());
            }
        }
    }
}



