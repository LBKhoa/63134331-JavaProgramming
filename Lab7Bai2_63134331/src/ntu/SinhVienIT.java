package ntu;

public class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemCSS;
    private double diemHTML;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCSS, double diemHTML) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemCSS + diemHTML) / 4;
    }
}
