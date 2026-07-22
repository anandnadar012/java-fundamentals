package variables;
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        float celsius = scanner.nextFloat();
        float fahrenheit = (celsius*9/5)+32;

        System.out.println("Fahrenheit:"  + fahrenheit);
        scanner.close();

    }

}
