package loops;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the table number: ");
        int table = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = i * table;
            System.out.println(table + " x " + i + " = " + product);
        }

        sc.close();
    }
}