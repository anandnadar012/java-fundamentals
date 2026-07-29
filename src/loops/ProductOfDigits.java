package loops;
import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();
        int num = digits;
        int product = 1;

        while ( num !=0 ){
            product  *= num % 10;
            num = num / 10;
        }
        System.out.println("Digits = " + digits);
        System.out.println("Product of the digits = " + product);
        sc.close();
    }
}
