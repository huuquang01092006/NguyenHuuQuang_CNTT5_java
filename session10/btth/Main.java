package session10.btth;

public class Main {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard("Nguyen Van A", "CC001", "1234567812345678", "123", 5000);
        cc.validate();
        cc.pay(1500);

        EWallet ew = new EWallet("Nguyen Van B", "EW001", "0987654321", 2000);
        ew.validate();
        ew.pay(500);

        Payable rewardPoints = new Payable() {
            private int points = 1000;

            @Override
            public void pay(double amount) {
                int usedPoints = (int) (amount * 10);
                if (usedPoints <= points) {
                    points -= usedPoints;
                    System.out.println("Thanh toán " + amount + " bằng Reward Points. Điểm còn lại: " + points);
                } else {
                    System.out.println("Không đủ điểm thưởng để thanh toán!");
                }
            }
        };

        rewardPoints.pay(50);
        rewardPoints.pay(120);
    }
}
