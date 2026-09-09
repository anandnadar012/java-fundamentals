package oop_basics;
import java.util.UUID;

abstract class Account {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    public Account(String accountHolder, double initialDeposit) {
        this.accountNumber = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.accountHolder = accountHolder;
        this.balance = Math.max(0.0, initialDeposit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("[Deposit] +$%.2f -> New Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("[Error] Deposit amount must be positive.");
        }
    }

    protected boolean deduct(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public abstract void withdraw(double amount);

    public void displayDetails() {
        System.out.printf("[%s] Holder: %s | Balance: $%.2f%n",
                accountNumber, accountHolder, balance);
    }
}

class SavingsAccount extends Account {
    private final double interestRate;

    public SavingsAccount(String accountHolder, double initialDeposit, double interestRate) {
        super(accountHolder, initialDeposit);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (deduct(amount)) {
            System.out.printf("[Savings] Withdrew $%.2f. Remaining: $%.2f%n", amount, getBalance());
        } else {
            System.out.println("[Savings Error] Insufficient funds for withdrawal.");
        }
    }

    public void applyMonthlyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.printf("[Savings] Applied monthly interest at %.2f%%: +$%.2f%n", interestRate, interest);
    }
}

class CheckingAccount extends Account {
    private final double overdraftLimit;

    public CheckingAccount(String accountHolder, double initialDeposit, double overdraftLimit) {
        super(accountHolder, initialDeposit);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("[Checking Error] Invalid withdrawal amount.");
            return;
        }

        if (getBalance() >= amount) {
            deduct(amount);
            System.out.printf("[Checking] Withdrew $%.2f. Remaining: $%.2f%n", amount, getBalance());
        } else if (getBalance() + overdraftLimit >= amount) {
            double deficit = amount - getBalance();
            deduct(getBalance());
            System.out.printf("[Checking Overdraft] Covered $%.2f using overdraft! Remaining balance: $0.00%n", deficit);
        } else {
            System.out.println("[Checking Error] Overdraft limit exceeded.");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account[] accounts = {
                new SavingsAccount("Ada Lovelace", 1200.00, 2.5),
                new CheckingAccount("Alan Turing", 350.00, 500.00)
        };

        System.out.println("=== Initializing Accounts ===");
        for (Account acc : accounts) {
            acc.displayDetails();
        }

        System.out.println("\n=== Performing Transactions ===");
        accounts[0].withdraw(300.00);
        accounts[1].withdraw(500.00);

        System.out.println("\n=== Specialized Actions ===");
        if (accounts[0] instanceof SavingsAccount savings) {
            savings.applyMonthlyInterest();
        }
    }
}