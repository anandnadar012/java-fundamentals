package oop_basics;

public class Main {
    public static void main(String[] args) {

        BankAccount alice = new BankAccount("Alice", 1000.0);
        BankAccount bob = new BankAccount("Bob", 500.0);
        alice.deposit(500.0);
        alice.withdraw(200.0);
        bob.withdraw(700.0);

        alice.displayDetails();
        bob.displayDetails();
    }
}