package loops;

import java.util.Scanner;

public class SumOfDigitsEqualTo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit == 5) {
                sum += digit;
            }
            num = num / 10;
        }
        System.out.println("Sum of digits Equal to 5 = " + sum);
        sc.close();
    }
}
