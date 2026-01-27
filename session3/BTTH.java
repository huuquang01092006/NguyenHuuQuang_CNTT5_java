package session3;

import java.util.Scanner;

public class BTTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ids = new int[100];
        String[] titles = new String[100];
        int[] quantities = new int[100];
        int current = 0;
        int choice = 0;
        do {
            System.out.print("""
                    1.Xem danh sach
                    2.Them
                    3.Cap nhat
                    4.Xoa
                    5.Tim kiem
                    6.Sap xep
                    7.Thoat
                    Lua chon cua ban:
                    """);
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (current == 0) {
                        System.out.println("Danh sach rong");
                    } else {
                        for (int i = 0; i < current; i++) {
                            System.out.println("--------------------------");
                            System.out.println("ID: " + ids[i]);
                            System.out.println("Title: " + titles[i]);
                            System.out.println("Quantities: " + quantities[i]);
                            System.out.println("--------------------------");
                        }
                    }
                    break;

                case 2:
                    if (current == ids.length) {
                        System.out.println("Danh sach da day!");
                        break;
                    }
                    System.out.print("Nhap ID: ");
                    int newId = sc.nextInt();
                    sc.nextLine();
                    boolean exists = false;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == newId) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("ID da ton tai!");
                        break;
                    }
                    System.out.print("Nhap ten sach: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Nhap so luong: ");
                    int newQty = sc.nextInt();

                    ids[current] = newId;
                    titles[current] = newTitle;
                    quantities[current] = newQty;
                    current++;
                    System.out.println("Them thanh cong!");
                    break;

                case 3:
                    System.out.print("Nhap ID can cap nhat: ");
                    int updateId = sc.nextInt();
                    boolean foundUpdate = false;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == updateId) {
                            System.out.print("Nhap so luong moi: ");
                            quantities[i] = sc.nextInt();
                            System.out.println("Cap nhat thanh cong!");
                            foundUpdate = true;
                            break;
                        }
                    }
                    if (!foundUpdate) {
                        System.out.println("Khong tim thay ID!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ID can xoa: ");
                    int deleteId = sc.nextInt();
                    boolean foundDelete = false;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == deleteId) {
                            for (int j = i; j < current - 1; j++) {
                                ids[j] = ids[j + 1];
                                titles[j] = titles[j + 1];
                                quantities[j] = quantities[j + 1];
                            }
                            current--;
                            System.out.println("Xoa thanh cong!");
                            foundDelete = true;
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.out.println("Khong tim thay ID!");
                    }
                    break;

                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 7);

        sc.close();
    }
}
