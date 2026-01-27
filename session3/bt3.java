package session3;

import java.util.*;

public class bt3 {

    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }
        System.out.println("Sách có số lượng nhiều nhất:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i] + " (Số lượng: " + quantities[i] + ")");
            }
        }
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }
        System.out.println("Sách có số lượng ít nhất:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i] + " (Số lượng: " + quantities[i] + ")");
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {
                "Lập trình Java cơ bản",
                "Cấu trúc dữ liệu",
                "Thuật toán nâng cao",
                "Cơ sở dữ liệu",
                "Mạng máy tính"
        };
        int[] quantities = {10, 5, 20, 5, 20};

        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
}
