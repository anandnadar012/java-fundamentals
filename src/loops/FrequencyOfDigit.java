package loops;
import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();

        System.out.print("Enter the number to check Frequency: ");
        int freqNum = sc.nextInt();
        int num = digits;
        int digit;
        int frequencyCounter = 0;

        while (num != 0) {
            digit = num % 10;
            if (digit == freqNum) {
                frequencyCounter++;
            }
            num = num / 10;
        }
        System.out.println("Digits = " + digits);
        System.out.println("number of " + freqNum +"'s = " + frequencyCounter);

        sc.close();
    }
}
