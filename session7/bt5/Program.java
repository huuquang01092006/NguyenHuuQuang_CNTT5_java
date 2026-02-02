package session7.bt5;

public class Program {
    public static void main(String[] args) {
        int score = 8;

        if (score <= Config.MAX_SCORE && score >= Config.MIN_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm không hợp lệ!");
        }
//        Config.MAX_SCORE = 20;
//        Lỗi: cannot assign a value to final variable
    }
}

