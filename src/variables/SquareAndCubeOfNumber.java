package variables;
import java.util.Scanner;

public class SquareAndCubeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;
        int cube = number * number * number;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);

        scanner.close();
    }
}