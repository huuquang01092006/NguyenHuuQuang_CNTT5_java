package session1;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (USD): ");
        double priceUSD = sc.nextDouble();
        System.out.print("Nhập tỷ giá (VNĐ/USD): ");
        float exchangeRate = sc.nextFloat();
        double totalVND = priceUSD * (double)exchangeRate;
        long roundedVND = (long)totalVND;
        System.out.printf("Giá sách (USD): %.2f%n", priceUSD);
        System.out.printf("Tỷ giá (VNĐ/USD): %.2f%n", exchangeRate);
        System.out.printf("Tổng tiền VNĐ (chưa làm tròn): %.2f%n", totalVND);
        System.out.printf("Tổng tiền VNĐ (làm tròn): %d%n", roundedVND);
        sc.close();
    }
}