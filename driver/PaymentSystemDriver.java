package driver;

import java.util.Scanner;
import model.CashPayment;
import model.CreditCardPayment;
import model.DebitCardPayment;
import model.PaymentMethod;
import model.PaymentType;

public class PaymentSystemDriver {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memilih metode pembayaran
        System.out.println("Pilih metode pembayaran (0: Tunai, 1: Kartu Kredit, 2: Kartu Debit): ");
        int choice = scanner.nextInt();

        PaymentMethod paymentMethod = null;

        // Memilih jenis metode pembayaran berdasarkan input pengguna
        switch (PaymentType.values()[choice]) {
            case CASH:
                paymentMethod = new CashPayment();
                break;
            case CREDIT_CARD:
                paymentMethod = new CreditCardPayment();
                break;
            case DEBIT_CARD:
                paymentMethod = new DebitCardPayment();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0); // Keluar dari program jika pilihan tidak valid
        }

        // Meminta pengguna untuk memasukkan jumlah pembayaran
        System.out.println("Masukkan jumlah pembayaran: ");
        double amount = scanner.nextDouble();

        // Melakukan pembayaran menggunakan metode yang dipilih
        paymentMethod.pay(amount);

        scanner.close();
    }
}