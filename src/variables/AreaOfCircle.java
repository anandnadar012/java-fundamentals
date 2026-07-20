package variables;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.printf("Area of Circle = %.2f%n", area);

        scanner.close();
    }
}