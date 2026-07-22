package variables;
import java.util.Scanner;

public class CurrencyConverterINRtoUSD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double inr = scanner.nextDouble();

        double usd = inr * 0.0115;

        System.out.println("₹" + inr);
        System.out.println("$" + usd);

        scanner.close();
    }
}