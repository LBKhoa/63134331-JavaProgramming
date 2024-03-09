package ntu;

import java.util.Scanner;

//Lớp SinhVienPoly
public class SinhVienPoly {
 protected String hoTen;
 protected String nganh;

 public SinhVienPoly(String hoTen, String nganh) {
     this.hoTen = hoTen;
     this.nganh = nganh;
 }

 public double getDiem() {
     return 0; // Phương thức trống, sẽ được ghi đè bởi lớp con
 }

 public String getHocLuc() {
     double diem = getDiem();
     if (diem < 5) {
         return "Yếu";
     } else if (diem < 6.5) {
         return "Trung bình";
     } else if (diem < 7.5) {
         return "Khá";
     } else if (diem < 9) {
         return "Giỏi";
     } else {
         return "Xuất sắc";
     }
 }

 public void xuat() {
     System.out.println("Họ tên: " + hoTen);
     System.out.println("Ngành: " + nganh);
     System.out.println("Điểm: " + getDiem());
     System.out.println("Học lực: " + getHocLuc());
 }
}
