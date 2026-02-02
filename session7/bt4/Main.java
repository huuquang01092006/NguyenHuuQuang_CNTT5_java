package session7.bt4;

public class Main {
    public static void main(String[] args) {
        ClassRoom s1 = new ClassRoom("Nguyen Van A");
        ClassRoom s2 = new ClassRoom("Tran Thi B");
        ClassRoom s3 = new ClassRoom("Le Van C");

        s1.contribute(100);
        s2.contribute(200);
        s3.contribute(150);

        ClassRoom.showFund();
    }
}