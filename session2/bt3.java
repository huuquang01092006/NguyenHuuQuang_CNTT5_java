package session2;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();

        int total = 0;
        int FINE_PER_DAY = 5000;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số ngày trễ của cuốn sách thứ " + i + ": ");
            int daysLate = sc.nextInt();

            total += daysLate * FINE_PER_DAY;
        }

        System.out.println("Tổng số tiền phạt: " + total + " VNĐ");

        sc.close();
    }
}
