package session6.bt3;
public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(
                "SP01",
                "Laptop Dell",
                15_000_000
        );

        p1.displayInfo();

        p1.setPrice(-5_000_000);

        p1.displayInfo();

        p1.setPrice(18_000_000);

        p1.displayInfo();
    }
}