package loops;

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;
        int digit;
        int smallestDigit = 9;

        while ( num !=0 ){
            digit = num % 10;
            if ( smallestDigit > digit) {
                smallestDigit = digit;
            }
            num = num / 10;
        }
        System.out.println("Digits = " + digits);
        System.out.println("Smallest Digit is = " + smallestDigit);

        sc.close();
    }
}
