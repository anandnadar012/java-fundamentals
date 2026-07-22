package variables;
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal:");
        double p = scanner.nextDouble();
        System.out.print("Enter Rate of Interest:");
        double r = scanner.nextDouble();
        System.out.print("Enter Time:");
        double t = scanner.nextDouble();

        double SI = p*r*t/100;

        System.out.println("Simple Interest:" + SI);

        scanner.close();
    }
}
