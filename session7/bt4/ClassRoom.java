package session7.bt4;

public class ClassRoom {
    private static double classFund = 0;

    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(double amount) {
        classFund += amount;
        System.out.println(studentName + " đóng " + amount + " vào quỹ.");
    }

    public static void showFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}


