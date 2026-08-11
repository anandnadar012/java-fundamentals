package loops;

import java.util.Scanner;

public class CountDigitsDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;
        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit % 3 ==0) {
                count += 1;
            }
            num = num / 10;
        }
        System.out.println("Digits divisible by 3 = " + count);
        sc.close();
    }
}
