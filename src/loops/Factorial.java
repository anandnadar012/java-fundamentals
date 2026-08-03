package loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial : ");
        int n = sc.nextInt();
        int fact = 1;

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else  {
            int temp = n;
            while (n > 0) {
                fact = fact * n;
                n--;
            }
            System.out.println("Factorial of " + temp + " is: " + fact);
        }
        sc.close();
    }
}
