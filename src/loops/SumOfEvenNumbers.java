package loops;
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to count its sum: ");
        int num = sc.nextInt();
        int sum = 0;


        for (int i=2 ; i <= num; i+=2) {
            sum +=i;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }

}
