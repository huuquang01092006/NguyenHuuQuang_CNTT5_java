package session7.btth;

public class Main {
    public static void main(String[] args) {
        Student nguyenThanhTung = new Student(1, "Nguyễn Thanh Tùng");
        Student nguyenThiKhanhHuyen = new Student(2, "Nguyễn Thị Khánh Huyền");
        Student doHongKy = new Student(3, "Đỗ Hồng Kỳ");
        Student nguyenHuuQuang = new Student(4, "Nguyễn Hữu Quang");

        nguyenThiKhanhHuyen.displayInfor();
        nguyenThanhTung.displayInfor();
        doHongKy.displayInfor();

        Student.studentCount = 5;
        Student.showTotalStudents();
    }
}
