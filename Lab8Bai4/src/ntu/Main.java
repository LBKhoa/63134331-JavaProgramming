package ntu;

public class Main {
    public static void main(String[] args) {
        // Tính tổng các số
        double[] numbers = {1.5, 2.7, 3.8, 4.2, 0.9};
        double sum = XPoly.sum(numbers);
        System.out.println("Tổng các số là: " + sum);

        // Tìm số nhỏ nhất
        double min = XPoly.min(numbers);
        System.out.println("Số nhỏ nhất là: " + min);

        // Tìm số lớn nhất
        double max = XPoly.max(numbers);
        System.out.println("Số lớn nhất là: " + max);

        // Chuyển đổi chuỗi
        String inputString = "nguyen van teo";
        String outputString = XPoly.toUpperFirstChar(inputString);
        System.out.println("Chuỗi sau khi chuyển đổi: " + outputString);
    }
}

