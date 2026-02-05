package session9.bt4;

class Animal {
    public void sound() {
        System.out.println("Động vật phát ra âm thanh...");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Gâu gâu!");
    }

    public void fetchBall() {
        System.out.println("Dog đang chạy đi nhặt bóng!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.sound();

        // animal.fetchBall(); // Lỗi compile-time: Animal không có phương thức này

        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.fetchBall();
        }
    }
}

