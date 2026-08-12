package loops;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("---------------Menu---------------");
            System.out.println(" Enter 1 for Hello! \n Enter 2 for GoodBye! \n Enter 3 to Exit");
            System.out.print("Your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("GoodBye!");
                    break;
                case 3:
                    System.out.println("Exited program");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (ch != 3);
        sc.close();
    }
}