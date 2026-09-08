package oop_basics;

public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    @Override
    public void processPayment(){
        System.out.println("Charging $" + amount + " to Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}
