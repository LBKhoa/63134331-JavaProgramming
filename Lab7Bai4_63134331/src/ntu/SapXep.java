package ntu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SapXep {
    private ArrayList<SinhVien> danhSach;

    public SapXep(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void sapXepTheoDiem(ArrayList<SinhVien> danhSach) {
        Collections.sort(danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiem(), sv1.getDiem());
            }
        });

        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
        Xuat xuat = new Xuat(danhSach);
        xuat.xuatDanhSach(danhSach);
    }
}



