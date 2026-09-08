package oop_basics;

public class Payment {
    protected double amount;

    public Payment(double amount){
        this.amount = amount;
    }
    public void processPayment(){
        System.out.println("Processing generic payment of $" + amount);
    }
    public void processPayment(String currency){
        System.out.println("Processing generic payment of " + amount + " " + currency);
    }
}
