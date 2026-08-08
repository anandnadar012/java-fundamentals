package loops;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int num = n;

        System.out.print("The Factors of "+ num + " is ");
        for (int i=1; i <= n; i++){
            if (num % i ==0){
                System.out.print( i + " ");
            }

        }

        sc.close();
    }
}
