package if_else;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation: +  -  *  /  %");
        char opr = sc.next().charAt(0);
        int result;

        if (opr == '+') {
            result = num1 + num2;
            System.out.println("Result = " + result);
        } else if (opr == '-') {
            result = num1 - num2;
            System.out.println("Result = " + result);
        } else if (opr == '*') {
            result = num1 * num2;
            System.out.println("Result = " + result);
        } else if (opr == '/') {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                result = num1 / num2;
                System.out.println("Result = " + result);
            }
        } else if (opr == '%') {
            if (num2 == 0) {
                System.out.println("Cannot take modulus by zero");
            } else {
                result = num1 % num2;
                System.out.println("Result = " + result);
            }
        } else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}