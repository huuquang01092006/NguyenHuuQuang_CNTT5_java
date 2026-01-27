package session3;

import java.util.Random;

public class bt4 {

    public static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] books = new int[10];

        for (int i = 0; i < books.length; i++) {
            books[i] = rand.nextInt(100);
        }

        System.out.println("Mảng trước khi sắp xếp:");
        displayBooks(books);

        sortBooks(books);

        System.out.println("Mảng sau khi sắp xếp:");
        displayBooks(books);
    }
}

