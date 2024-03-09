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

    public static final double min(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Danh sách trống, không có số để tìm số nhỏ nhất");
        }

        double min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    public static final double max(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Danh sách trống, không có số để tìm số lớn nhất");
        }

        double max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

    public static final String toUpperFirstChar(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char firstChar = Character.toUpperCase(words[i].charAt(0));
                String upperFirstChar = Character.toString(firstChar);
                words[i] = upperFirstChar + words[i].substring(1);
            }
            result.append(words[i]);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
