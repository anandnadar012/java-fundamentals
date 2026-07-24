package operators;
import java.util.Scanner;
public class VotingEligibilityChecker {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.print("Are u citizen of India?. Enter true or false");
        boolean citizen = sc.nextBoolean();

        boolean eligible = (age > 18) &&  citizen;
        System.out.println(" Eligible = "+ eligible);

        sc.close();
    }
}
