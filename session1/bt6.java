package session1;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = sc.nextInt();
        int shelfNumber = (stt - 1) / 25 + 1;
        int position = (stt - 1) % 25 + 1;
        String area = shelfNumber <= 10 ? "Khu Cận" : "Khu Viễn";
        System.out.println("\n===== THÔNG TIN ĐỊNH VỊ =====");
        System.out.printf("Sách số: %d%n", stt);
        System.out.printf("Địa chỉ: Kệ số %d - Vị trí %d%n", shelfNumber, position);
        System.out.printf("Phân khu: %s%n", area);
        sc.close();
    }
}