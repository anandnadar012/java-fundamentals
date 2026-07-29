package loops;
import java.util.Scanner;

public class FirstDigitOfTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;

        while (num >= 10) {
            num = num / 10;
        }
        System.out.println("Digits = " + digits);
        System.out.println("First digit = " + num);
        sc.close();
    }
}
