package session9.btth;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] arr = new Employee[100];
        int current = 0;
        int choice;

        do {
            System.out.println("\n******** MENU ********");
            System.out.println("1. Nhập nhân viên");
            System.out.println("2. Nhập quản lý");
            System.out.println("3. Tính lương");
            System.out.println("4. Hiển thị");
            System.out.println("5. Sắp xếp lương giảm dần");
            System.out.println("6. Đếm nhân viên & quản lý");
            System.out.println("7. Tìm theo tên");
            System.out.println("8. Thoát");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Số lượng NV: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        arr[current] = new Employee();
                        arr[current].inputData(sc);
                        current++;
                    }
                    break;

                case 2:
                    System.out.print("Số lượng Manager: ");
                    int m = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < m; i++) {
                        arr[current] = new Manager();
                        ((Manager) arr[current]).inputManager(sc);
                        current++;
                    }
                    break;

                case 3:
                    for (int i = 0; i < current; i++) {
                        arr[i].calcSalary();
                    }
                    System.out.println("Đã tính lương xong");
                    break;

                case 4:
                    for (int i = 0; i < current; i++) {
                        arr[i].displayData();
                    }
                    break;

                case 5:
                    for (int i = 0; i < current - 1; i++) {
                        for (int j = i + 1; j < current; j++) {
                            if (arr[i].getSalary() < arr[j].getSalary()) {
                                Employee tmp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = tmp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp");
                    break;

                case 6:
                    int countE = 0, countM = 0;
                    for (int i = 0; i < current; i++) {
                        if (arr[i] instanceof Manager) countM++;
                        else countE++;
                    }
                    System.out.println("Employee: " + countE);
                    System.out.println("Manager: " + countM);
                    break;

                case 7:
                    System.out.print("Nhập tên cần tìm: ");
                    String key = sc.nextLine().toLowerCase();
                    for (int i = 0; i < current; i++) {
                        if (arr[i].getName().toLowerCase().contains(key)) {
                            arr[i].displayData();
                        }
                    }
                    break;
            }

        } while (choice != 8);
    }
}
