package ntu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhsach = new ArrayList<>();
        Menu menu = new Menu();

        int choice;
        do {
            choice = menu.hienMenu();
            menu.thucHien(choice);
        } while (choice != 5);
    }
}
