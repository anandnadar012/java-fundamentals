package loops;
import java.util.Scanner;

public class NumbersFrom1toNEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int num = sc.nextInt();


        for (int i = 2 ; i <= num; i+=2) {
            System.out.println("The numbers are :" + i);
        }
        sc.close();
    }
}
