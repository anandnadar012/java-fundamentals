package loops;

import java.util.Scanner;

public class SumOfOddPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;
        int sum = 0;
        int position = 1;

        while (num != 0) {
            int digit = num % 10;
            if (position % 2 != 0) {
                sum += digit;
            }
            num = num / 10;
            position++;
        }
        System.out.println("Sum at Odd position = " + sum);
        sc.close();
    }

}
