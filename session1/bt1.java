package session1;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();
        System.out.print("Nhập giá tiền: ");
        double price = sc.nextDouble();
        System.out.print("Sách còn trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();
        int bookAge = 2026 - publishYear;
        System.out.println("\n===== PHIẾU THÔNG TIN SÁCH =====");
        System.out.printf("Tên sách: %s%n", bookName.toUpperCase());
        System.out.printf("Mã số: %s | Tuổi thọ: %d năm%n", bookID, bookAge);
        System.out.printf("Giá tiền: %.2f%n", price);
        System.out.printf("Tình trạng: %s%n", isAvailable ? "Còn sách" : "Đã mượn");
        sc.close();
    }
}
