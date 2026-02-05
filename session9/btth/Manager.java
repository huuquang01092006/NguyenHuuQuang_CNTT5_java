package session9.btth;
import java.util.Scanner;

public class Manager extends Employee {
    private String position;
    private String department;

    public Manager() {
    }

    public Manager(String id, String name, int age, double credit,
                   String position, String department) {
        super(id, name, age, credit);
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void inputManager(Scanner sc) {
        inputData(sc);
        System.out.print("Nhập vị trí: ");
        position = sc.nextLine();
        System.out.print("Nhập phòng ban: ");
        department = sc.nextLine();
    }

    @Override
    public void calcSalary() {
        super.calcSalary();
        double s = getSalary() * 1.2;
        try {
            java.lang.reflect.Field f = Employee.class.getDeclaredField("salary");
            f.setAccessible(true);
            f.set(this, s);
        } catch (Exception ignored) {}
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Position: " + position +
                " | Department: " + department);
    }
}

