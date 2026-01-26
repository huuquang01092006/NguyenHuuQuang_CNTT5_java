package session1;

import java.util.Scanner;

public class bt2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số ngày chậm trễ: ");
    int n = sc.nextInt();
    System.out.print("Nhập số lượng sách mượn: ");
    int m = sc.nextInt();
    double total = (double)(n * m * 5000);
    if (n > 7 && m >= 3) {
      total *= 1.2;
    }

    System.out.println("\n===== PHIẾU TÍNH TIỀN PHẠT =====");
    System.out.printf("Số ngày chậm: %d%n", n);
    System.out.printf("Số lượng sách: %d%n", m);
    System.out.printf("Tiền phạt gốc: 20000.0 VNĐ%n");
    System.out.printf("Tiền phạt sau điều chỉnh: %.2f VND%n", total);
    boolean needBlockCard = total > (double)50000.0F;
    System.out.printf("Yêu cầu khóa thẻ: %b%n", needBlockCard);
    sc.close();
  }
}