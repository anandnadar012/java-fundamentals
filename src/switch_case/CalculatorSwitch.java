package switch_case;
import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char opr = sc.next().charAt(0);
        double result;

        switch (opr) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Cannot take modulus by zero");
                } else {
                    result = num1 % num2;
                    System.out.println("Result = " + result);
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}