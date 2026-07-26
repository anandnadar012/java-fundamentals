package if_else;
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter taxable income (in ₹): ");
        double income = sc.nextDouble();
        double tax;

        if (income < 0) {
            System.out.println("Invalid income");
            sc.close();
            return;
        }
        if (income <= 400000) {
            tax = 0;
        } else if (income <= 800000) {
            tax = (income - 400000) * 0.05;
        } else if (income <= 1200000) {
            tax = (400000 * 0.05) + (income - 800000) * 0.10;
        } else if (income <= 1600000) {
            tax = (400000 * 0.05) + (400000 * 0.10)
                    + (income - 1200000) * 0.15;
        } else if (income <= 2000000) {
            tax = (400000 * 0.05) + (400000 * 0.10) + (400000 * 0.15)
                    + (income - 1600000) * 0.20;
        } else if (income <= 2400000) {
            tax = (400000 * 0.05) + (400000 * 0.10) + (400000 * 0.15)
                    + (400000 * 0.20) + (income - 2000000) * 0.25;
        } else {
            tax = (400000 * 0.05) + (400000 * 0.10) + (400000 * 0.15)
                    + (400000 * 0.20) + (400000 * 0.25)
                    + (income - 2400000) * 0.30;
        }

        System.out.println("Income Tax Payable: ₹" + tax);

        sc.close();
    }
}