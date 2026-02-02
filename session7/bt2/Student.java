package session7.bt2;

public class Student {
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setName(String name) {
        this.studentName = name;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + studentId + ", Tên SV: " + studentName);
    }
}



