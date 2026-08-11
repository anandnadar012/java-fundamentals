package loops;

import java.util.Scanner;

public class ProductOfDigitsGreaterThan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;
        int product = 1;

        while (num != 0) {
            int digit = num % 10;
            if (digit > 5) {
                product *= digit;
            }
            num = num / 10;
        }
        System.out.println("product of digits greater than 5 = " + product);
        sc.close();
    }
}
