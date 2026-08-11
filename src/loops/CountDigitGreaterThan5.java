package loops;

import java.util.Scanner;

public class CountDigitGreaterThan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;
        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit > 5) {
                count += 1;
            }
            num = num / 10;
        }
        System.out.println("numbers greater than 5 = " + count);
        sc.close();
    }
}
