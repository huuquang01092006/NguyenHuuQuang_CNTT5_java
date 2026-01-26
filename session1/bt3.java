package session1;

public class bt3 {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.printf("Trước khi hoán đổi: book1 = %s, book2 = %s%n", book1, book2);
        System.out.printf("Sau khi hoán đổi: book1 = %s, book2 = %s%n", book2, book1);
        // Trên Heap: "Java Basic", "Python Intro" vẫn giữ nguyên
        // Trên Stack: book1, book2, temp chỉ thay đổi địa chỉ tham chiếu
        // => Sau hoán đổi: book1 trỏ đến "Python Intro", book2 trỏ đến "Java Basic"

    }
}
