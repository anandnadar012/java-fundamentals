package loops;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int digits = sc.nextInt();
        int num = digits;
        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            int cube = lastDigit * lastDigit * lastDigit;
            sum += cube;
            num = num / 10;
        }
        System.out.println("Number: " + digits);
        System.out.println("Sum of cubes: " + sum);

        if (digits == sum) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is NOT Armstrong");
        }
        sc.close();
    }
}