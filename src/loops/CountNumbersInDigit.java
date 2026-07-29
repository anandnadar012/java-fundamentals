package loops;
import java.util.Scanner;

public class CountNumbersInDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int digits = sc.nextInt();
        int num = digits;
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number: " + digits);
        System.out.println("Total digits: " + count);

        sc.close();
    }
}