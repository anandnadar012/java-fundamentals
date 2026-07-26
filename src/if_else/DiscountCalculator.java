package if_else;
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total amount: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid amount");
            sc.close();
            return;
        }

        double discount;
        if (amount < 2000) {
            discount = amount * 0.02;
        } else if (amount <= 5000) {
            discount = amount * 0.05;
        } else {
            discount = amount * 0.10;
        }

        double netAmount = amount - discount;

        System.out.println("Purchase Amount: ₹" + amount);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Net Amount to Pay: ₹" + netAmount);

        sc.close();
    }
}