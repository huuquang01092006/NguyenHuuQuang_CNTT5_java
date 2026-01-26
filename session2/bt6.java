package session2;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxBorrow = 0;
        int minBorrow = 0;
        int sum = 0;
        int count = 0;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Nhập số lượt mượn sách ngày thứ " + day + ": ");
            int borrow = sc.nextInt();

            if (borrow == 0) {
                continue;
            }

            if (count == 0) {
                maxBorrow = borrow;
                minBorrow = borrow;
            } else {
                if (borrow > maxBorrow) {
                    maxBorrow = borrow;
                }
                if (borrow < minBorrow) {
                    minBorrow = borrow;
                }
            }

            sum += borrow;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Lượt mượn cao nhất: " + maxBorrow);
            System.out.println("Lượt mượn thấp nhất: " + minBorrow);
            System.out.println("Trung bình lượt mượn (các ngày mở cửa): " + average);
        } else {
            System.out.println("Không có ngày nào mở cửa trong tuần.");
        }

        sc.close();
    }
}
