package session4;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String description = sc.nextLine();

        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + 3;
            int end = description.indexOf(",", start);
            if (end == -1) end = description.length();
            String position = description.substring(start, end).trim();

            String newDescription = description.replaceFirst("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Mã vị trí: " + position);
            System.out.println("Mô tả mới: " + newDescription);
        } else {
            System.out.println("Không tìm thấy thông tin kệ.");
        }
    }
}

