package ntu;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.7, 3.8, 4.2, 0.9};

        // Tìm số nhỏ nhất
        double min = XPoly.min(numbers);
        System.out.println("Số nhỏ nhất là: " + min);

        // Tìm số lớn nhất
        double max = XPoly.max(numbers);
        System.out.println("Số lớn nhất là: " + max);
    }
}
