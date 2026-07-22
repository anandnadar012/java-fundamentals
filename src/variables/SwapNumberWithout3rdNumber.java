package variables;
import java.util.Scanner;
public class SwapNumberWithout3rdNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("First Number:" + num1);
        System.out.println("Second Number:" + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Swapped Number:");
        System.out.println("First Number:" + num1);
        System.out.println("Second Number:" + num2);

        scanner.close();
    }

}
