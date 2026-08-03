package loops;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to checks if its Strong number : ");
        int n = sc.nextInt();
        int fact = 1;
        int temp = 1;

        while (n != 0) {
            int lastDigit = n % 10;
             temp = temp * 10 + lastDigit;
            while (temp > 0) {
                fact = fact * temp;
                temp--;
            }
            n = n / 10;
        }

        if (fact == n) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
        
        sc.close();
    }
}
