package ntu;

import java.util.Scanner;

//Lớp SinhVienPoly là lớp trừu tượng vì có phương thức trừu tượng getDiem()
public abstract class SinhVienPoly {
 // Thuộc tính
 protected String hoTen;
 protected String nganh;

 // Constructor
 public SinhVienPoly(String hoTen, String nganh) {
     this.hoTen = hoTen;
     this.nganh = nganh;
 }

 // Phương thức trừu tượng để lấy điểm
 public abstract double getDiem();

 // Phương thức để xếp loại học lực
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

 // Phương thức xuất thông tin
 public void xuat() {
     System.out.println("Họ tên: " + hoTen);
     System.out.println("Ngành: " + nganh);
     System.out.println("Điểm: " + getDiem());
     System.out.println("Học lực: " + getHocLuc());
 }
}

