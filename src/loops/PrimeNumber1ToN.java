package loops;
import java.util.Scanner;

public class PrimeNumber1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check range: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers from 1 to " + n + ":");

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}