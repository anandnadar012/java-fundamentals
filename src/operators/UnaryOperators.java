package operators;
import java.util.Scanner;

public class UnaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Original = " + num);

        System.out.println("Pre Increment = " + (++num));
        System.out.println("After Pre Increment = " + num);
        System.out.println("Post Increment = " + (num++));
        System.out.println("After Post Increment = " + num);
        System.out.println("Pre Decrement = " + (--num));
        System.out.println("After Pre Decrement = " + num);
        System.out.println("Post Decrement = " + (num--));
        System.out.println("After Post Decrement = " + num);

        sc.close();
    }
}