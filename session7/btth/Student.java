package session7.btth;

public class Student {
    public int id;
    public String name;
    static final String SCHOOL_NAME = "PTIT";
    static int studentCount;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    public void displayInfor() {
        System.out.println("-------------------------");
        System.out.println("School Name: " + SCHOOL_NAME);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("-------------------------");
    }

    public static void showTotalStudents() {
        System.out.println("Student Count: " + getStudentCount());
    }
}
