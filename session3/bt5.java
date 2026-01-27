package session3;

import java.util.Scanner;

public class bt5 {

    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Không tìm thấy mã sách " + bookId);
            return n;
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Đã xóa sách có mã " + bookId);
        return n - 1;
    }

    public static void displayBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.print("Danh sách hiện tại: ");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;

        displayBooks(books, n);

        while (n > 0) {
            System.out.print("Nhập mã sách cần xóa (hoặc nhập -1 để dừng): ");
            int bookId = sc.nextInt();
            if (bookId == -1) {
                break;
            }
            n = deleteBook(books, n, bookId);
            displayBooks(books, n);
        }

        System.out.println("Kết thúc chương trình.");
        sc.close();
    }
}
