package switch_case;
import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to check is it vowel: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid character");
            sc.close();
            return;
        }

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println("is consonant");
        }

        sc.close();
    }
}