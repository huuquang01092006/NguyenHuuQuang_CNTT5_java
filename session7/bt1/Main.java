package session7.bt1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyen Van A");
        Student s2 = new Student("SV002", "Tran Thi B");
        Student s3 = new Student("SV003", "Le Van C");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Student.displayTotalStudent();
    }
}
