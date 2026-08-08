package loops;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int originaln1 = n1;
        int originaln2 = n2;

        while (n2 != 0) {
            int remainder = n1 % n2;
            n1 = n2;
            n2  = remainder;
        }

        System.out.println("HCF of " + originaln1 + " and " + originaln2 + " is: " + n1);

        sc.close();
    }
}