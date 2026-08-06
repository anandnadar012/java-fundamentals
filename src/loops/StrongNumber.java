package loops;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Strong number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            sum += fact;
            n = n / 10;
        }

        System.out.println("Sum of digit factorials: " + sum);
        if (sum == original) {
            System.out.println(original + " is a Strong number");
        } else {
            System.out.println(original + " is not a Strong number");
        }

        sc.close();
    }
}