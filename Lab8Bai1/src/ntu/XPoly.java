package ntu;

public final class XPoly {

    private XPoly() {
        // Constructor private để ngăn việc khởi tạo đối tượng từ bên ngoài
    }

    public static final double sum(double... x) {
        double total = 0;
        for (double num : x) {
            total += num;
        }
        return total;
    }
}
