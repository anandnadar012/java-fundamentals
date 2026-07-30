package loops;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int digits = sc.nextInt();
        int num = digits;
        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("Number: " + digits);
        System.out.println("Reversed number: " + reverse);
        if (digits == reverse) {
            System.out.println("Palindrome Numbers");
        }else{
            System.out.println("Not a Palindrome Numbers");
        }

        sc.close();
    }
}