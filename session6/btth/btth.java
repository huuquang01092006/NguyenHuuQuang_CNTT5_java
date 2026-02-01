package session6.BTTH;

public class btth {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(
                "0987654321",
                "Hà Bích Ngọc",
                100_000_000
        );

        BankAccount acc2 = new BankAccount(
                "0123456789",
                "Nguyễn Văn A",
                50_000_000
        );

        System.out.println("THÔNG TIN TRƯỚC GIAO DỊCH");
        acc1.display();
        acc2.display();

        acc1.deposit(20_000_000);
        acc2.withdraw(10_000_000);

        System.out.println("THÔNG TIN SAU GIAO DỊCH");
        acc1.display();
        acc2.display();
    }
}