package session3;

import java.util.*;

public class bt6 {

    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;
            } else if (a[i] > b[j]) {
                if (k == 0 || temp[k - 1] != b[j]) {
                    temp[k++] = b[j];
                }
                j++;
            } else {
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }

        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }

        int[] arrayMerge = new int[k];
        for (int t = 0; t < k; t++) {
            arrayMerge[t] = temp[t];
        }
        return arrayMerge;
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
        int[] arrayFirst = {101, 103, 105, 110};
        int[] arraySecond = {102, 103, 106, 110, 115};

        System.out.println("Kho sách hiện tại:");
        displayBooks(arrayFirst);

        System.out.println("Lô sách quyên góp:");
        displayBooks(arraySecond);

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.println("Danh sách hoàn chỉnh sau khi gộp:");
        displayBooks(arrayMerge);
    }
}
