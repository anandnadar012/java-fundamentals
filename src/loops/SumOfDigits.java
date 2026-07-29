package loops;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;
        int sum = 0;

        while ( num !=0 ){
            sum  += num % 10;
            num = num / 10;
        }
        System.out.println("Digits = " + digits);
        System.out.println("Sum of the digits = " + sum);
        sc.close();
    }
}
