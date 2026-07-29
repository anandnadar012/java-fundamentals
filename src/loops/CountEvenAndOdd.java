package loops;

import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;
        int digit;
        int evenCounter = 0;
        int oddCounter = 0;

        while ( num !=0 ){
            digit = num % 10;
            if (digit %2==0){
                evenCounter++;
            }else{
                oddCounter++;
            }
            num = num / 10;
        }
        System.out.println("Digits = " + digits);
        System.out.println("number of even digits = " + evenCounter);
        System.out.println("number of odd digits = " + oddCounter);
        sc.close();
    }
}
