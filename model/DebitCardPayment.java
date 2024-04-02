package model;

public class DebitCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran dengan kartu debit sebesar $" + amount);
    }
}

