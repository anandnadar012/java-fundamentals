package loops;

import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check: ");
        int n = sc.nextInt();
        boolean found = false;

        if (n == 0 || n == 1) {
            System.out.println(n + " belongs to the Fibonacci sequence.");
        } else if (n < 0) {
            System.out.println(n + " doesn't belong to the Fibonacci sequence.");
        } else {
            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                int next = a + b;
                a = b;
                b = next;
                if (a == n) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(n + " belongs to the Fibonacci sequence.");
            } else {
                System.out.println(n + " doesn't belong to the Fibonacci sequence.");
            }
        }

        sc.close();
    }
}