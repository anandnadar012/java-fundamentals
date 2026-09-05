package oop_basics;

public class BankAccount {
    String accountHolder;
    Double balance;

    public BankAccount(String accountHolder, Double initialbalance){
        this.accountHolder = accountHolder;
        this.balance = initialbalance;
    }

    public void deposit(Double amount){
        if (amount > 0){
            balance = balance + amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(Double amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
        } else {
            System.out.println("Insufficient or Invalid withdraw amount.");
        }
    }
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

}
