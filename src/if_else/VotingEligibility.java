package if_else;
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Are u Indian Citizen? \n type 1 for yes and 0 for no :");
        int citizen = sc.nextInt();

        if (age >= 18 && citizen== 1){
            System.out.println("You are eligible for Voting");
        }else if(age <18 && citizen== 1){
            System.out.println("You should be atleast 18 to become eligible");
        }else if(age >= 18 && citizen== 0){
            System.out.println("You are not eligible because u are not Indian citizen");
        }else {
            System.out.println("You are not eligible");
        }

        sc.close();
    }

}
