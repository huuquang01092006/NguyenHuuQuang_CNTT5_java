package session9.bt3;

class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phòng ban: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Nguyễn Văn B", 1500.0, "Phòng Kinh doanh");
        m.displayInfo();
    }
}
