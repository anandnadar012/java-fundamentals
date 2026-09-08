package oop_basics;

public class PaymentDriver {
    public static void main(String[] args){

        Payment p = new Payment(100.0);
        p.processPayment();
        p.processPayment("EUR");

        System.out.println();

        Payment[] payments = new Payment[2];
        payments[0] = new CreditCardPayment(250.0, "1234567812345678");
        payments[1] = new UPIPayment(150.0, "alice@upi");

        for (Payment payment : payments) {
            payment.processPayment();
        }
    }
}
