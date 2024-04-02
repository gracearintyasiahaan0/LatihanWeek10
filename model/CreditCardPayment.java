package model;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran dengan kartu kredit sebesar $" + amount);
    }
}
