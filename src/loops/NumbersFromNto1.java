package loops;
import java.util.Scanner;

public class NumbersFromNto1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int num = sc.nextInt();


        for (int i = num ; i >= 1; i--) {
            System.out.println("The numbers are :" + i);
        }
        sc.close();
    }
}
