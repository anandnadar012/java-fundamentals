package loops;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <=n/2; i++) {
            if (n % i==0){
                sum += i;
            }
        }

        System.out.println("Sum of divisors = " + sum);

        if (sum == n) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }

        sc.close();
    }
}
