package session2;

import java.util.Scanner;
public class BTTH {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//          System.out.print("Nhap so luong sach phai tra: ");
//          int quant = sc.nextInt();
//          int totalMoney =0;
//          for (int i = 1; i <= quant; i++) {
//              System.out.printf("Nhap so ngay tra muon cua sach thu %d: ", i);
//              int day = sc.nextInt();
//              if (day <= 5) {
//                  totalMoney = totalMoney + day * 2000;
//              }
//              else {
//                  totalMoney = totalMoney + ((day -5) * 5000 + 10000);
//              }
//          }
//          System.out.printf("Tong tien phai tra: %dVND", totalMoney);
//
//        System.out.print("Nhap so tuoi: ");
//        int age = sc.nextInt();
//        System.out.print("Nhap so luong sach da muon: ");
//        int quantityBook = sc.nextInt();
//        System.out.print("Co the uu tien hay khong(1. co, 2. khong): ");
//        int priorityCard = sc.nextInt();
//        if (priorityCard == 1){
//            System.out.println("Đủ tiêu chuẩn nâng cấp VIP");
//        } else if (age >= 18 && quantityBook >= 10) {
//            System.out.println("Đủ tiêu chuẩn nâng cấp VIP");
//        }else {
//            System.out.println("Chưa đủ tiêu chuẩn");
//        }
        int count =0;
        int ID;
        do{
            System.out.print("Nhap ma so sach: ");
            ID = sc.nextInt();
            if(ID < 0){
                continue;
            }else {
                count++;
            }
        }while(ID != 0);
        System.out.printf("So luong sach hop le: %d", count - 1);
    }
}