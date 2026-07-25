package if_else;
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Internal marks: ");
        int internal = sc.nextInt();
        System.out.print("Enter Semester End marks: ");
        int see = sc.nextInt();
        if (internal >= 40 && see >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}