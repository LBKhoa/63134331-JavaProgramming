package ntu;

//Lớp SinhVienIT kế thừa từ SinhVienPoly
public class SinhVienIT extends SinhVienPoly {
 private double diemJava;
 private double diemHTML;
 private double diemCSS;

 public SinhVienIT(String hoTen, double diemJava, double diemHTML, double diemCSS) {
     super(hoTen, "IT");
     this.diemJava = diemJava;
     this.diemHTML = diemHTML;
     this.diemCSS = diemCSS;
 }

 @Override
 public double getDiem() {
     return (2 * diemJava + diemHTML + diemCSS) / 4;
 }
}
