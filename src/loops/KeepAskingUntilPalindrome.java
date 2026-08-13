package loops;
import java.util.Scanner;

public class KeepAskingUntilPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        int original;
        int reversed;
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();

             original = num;
            int temp = num;
             reversed = 0;

            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp = temp / 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome. Stopping.");
            } else {
                System.out.println(original + " is NOT a palindrome. Try again.");
            }

        } while (original != reversed);

        sc.close();
    }
}