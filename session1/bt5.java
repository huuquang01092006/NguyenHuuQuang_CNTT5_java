package session1;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();
        int thousands = code / 1000;
        int hundreds = code / 100 % 10;
        int dozens = code / 10 % 10;
        int units = code % 10;
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        boolean isValid = sumOfFirstThreeNumber % 10 == units;
        System.out.println("\n===== KIỂM TRA MÃ SÁCH =====");
        System.out.printf("Mã nhập: %d%n", code);
        System.out.printf("Chữ số kiểm tra kỳ vọng: %d%n", sumOfFirstThreeNumber);
        System.out.printf("Kết quả kiểm tra mã sách: %s%n", isValid ? "HỢP LỆ" : "SAI MÃ");
        sc.close();
    }
}