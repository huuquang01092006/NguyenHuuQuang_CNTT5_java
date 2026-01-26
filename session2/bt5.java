package session2;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int reputation = 100;
        int daysLate;

        System.out.println("Nhập lịch sử trả sách (nhập 999 để thoát):");

        while (true) {
            System.out.print("Nhập số ngày trễ (<=0 nếu đúng hạn): ");
            daysLate = sc.nextInt();

            if (daysLate == 999) {
                break;
            }

            if (daysLate <= 0) {
                reputation += 5;
            } else {
                reputation -= daysLate * 2;
            }
        }

        System.out.println("Tổng điểm uy tín: " + reputation);

        if (reputation > 120) {
            System.out.println("Xếp loại: Độc giả Thân thiết");
        } else if (reputation >= 80) {
            System.out.println("Xếp loại: Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Xếp loại: Độc giả cần lưu ý");
        }

        sc.close();
    }
}
