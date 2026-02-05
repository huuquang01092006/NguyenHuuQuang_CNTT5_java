package session9.bt1;

class Student extends Person {
    String maSV;
    double diemTB;

    public Student(String hoTen, int tuoi, String maSV, double diemTB) {
        super(hoTen, tuoi);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Điểm trung bình: " + diemTB);
    }
}
