package loops;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int larger;

        if (n1 > n2) {
            larger = n1;
        } else {
            larger = n2;
        }
        int lcm = larger;
        while (lcm % n1 != 0 || lcm % n2!= 0) {
            lcm += larger;
        }
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);

        sc.close();
    }
}