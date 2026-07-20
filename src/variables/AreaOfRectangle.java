package variables;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle:");
        float length = scanner.nextFloat();
        System.out.print("Enter Breadth of Rectangle: ");
        float breadth = scanner.nextFloat();
        float result = length * breadth;

        System.out.println("Area of Rectangle = " + result);

        scanner.close();
        }
    }

