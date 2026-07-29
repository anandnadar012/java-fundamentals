package loops;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;
        int digit;
        int largestDigit = 0;

        while ( num !=0 ){
            digit = num % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            num = num / 10;
        }
        System.out.println("Digits = " + digits);
        System.out.println("Largest Digit is = " + largestDigit);

        sc.close();
    }
}
