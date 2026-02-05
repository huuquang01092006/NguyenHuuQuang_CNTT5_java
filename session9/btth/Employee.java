package session9.btth;

import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private int age;
    private double credit;
    private static final double BASE_SALARY = 1300000;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, int age, double credit) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.matches("E\\w{3}")) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 8 && name.length() <= 50) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        }
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void inputData(Scanner sc) {
        while (true) {
            System.out.print("Nhập mã NV (E + 3 ký tự): ");
            String tmp = sc.nextLine();
            if (tmp.matches("E\\w{3}")) {
                id = tmp;
                break;
            }
        }

        while (true) {
            System.out.print("Nhập tên (8-50 ký tự): ");
            String tmp = sc.nextLine();
            if (tmp.length() >= 8 && tmp.length() <= 50) {
                name = tmp;
                break;
            }
        }

        while (true) {
            System.out.print("Nhập tuổi >=18: ");
            age = Integer.parseInt(sc.nextLine());
            if (age >= 18) break;
        }

        while (true) {
            System.out.print("Nhập hệ số lương >0: ");
            credit = Double.parseDouble(sc.nextLine());
            if (credit > 0) break;
        }
    }

    public void calcSalary() {
        salary = credit * BASE_SALARY;
    }

    public void displayData() {
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Credit: " + credit +
                " | Salary: " + salary);
    }
}