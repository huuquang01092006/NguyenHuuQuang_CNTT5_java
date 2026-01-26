package session1;

import java.util.Scanner;

public class BTTH {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập mã số sách: ");
    int bookID = sc.nextInt();
    sc.nextLine();
    System.out.print("Nhập tên sách: ");
    String title = sc.nextLine();
    System.out.print("Nhập giá nhập: ");
    double price = sc.nextDouble();
    System.out.print("Nhập số lượng: ");
    int quantity = sc.nextInt();
    System.out.print("Sách còn trong kho? (true/false): ");
    boolean isAvailable = sc.nextBoolean();
    double totalValue = price * (double)quantity;
    boolean isLargeStock = quantity > 100;
    boolean canBorrow = isAvailable && quantity > 0;
    System.out.println("\n===== BÁO CÁO TÌNH TRẠNG SÁCH =====");
    System.out.printf("Mã sách: %d%n", bookID);
    System.out.printf("Tên sách: %s%n", title);
    System.out.printf("Giá nhập: %.2f%n", price);
    System.out.printf("Số lượng: %d%n", quantity);
    System.out.printf("Tổng giá trị kho: %.2f%n", totalValue);
    System.out.printf("Kho lớn (>100 sách): %b%n", isLargeStock);
    System.out.printf("Trạng thái: %s%n", isAvailable ? "Còn hàng" : "Hết hàng");
    System.out.printf("Có thể mượn: %b%n", canBorrow);
    sc.close();
  }
}
