package session2;

import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tuoi: ");
        int age = sc.nextInt();
        System.out.print("Nhap so sach dang giu: ");
        int quantityBook = sc.nextInt();
        if (age >= 18 && quantityBook <= 3 ) {
            System.out.print("Ban du dieu kien muon sach quy hiem");
        }else if (age < 18) {
            System.out.println("Khong du dieu kien");
            System.out.print("-Ly do: Ban phai du 18 tuoi");
        }else if (quantityBook >= 4) {
            System.out.println("Khong du dieu kien");
            System.out.print("-Ly do: Ban da muon toi da 3 cuon");
        }
    }
}