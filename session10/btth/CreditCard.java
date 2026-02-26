package session10.btth;

import java.util.Scanner;

public class CreditCard extends PaymentMethod implements Payable{
    private String cardNumber;
    private String cvv;
    private double creditLimit;

    public CreditCard() {
    }

    public CreditCard(String accountName, String paymentId, String cardNumber, String cvv, double creditLimit) {
        super(accountName, paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void pay(double money) {
        Scanner sc = new Scanner(System.in);
        if(money < 0) {
            System.err.println("Số tiền không hợp lệ...");
            return;
        }

        if(money > creditLimit) {
            System.err.println("Đã vượt quá hạn mức cho phép...");
            return;
        }

        System.out.println("Nhập vào mã cvv: ");
        String inputCVV = sc.nextLine();
        if(inputCVV.equals(cvv)) {
            System.out.println("Thanh toán thành công");
        } else {
            System.out.println("Nhập sai mã bảo mật");
        }
    }

    @Override
    public void validate() {

    }
}