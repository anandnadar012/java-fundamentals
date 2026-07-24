package operators;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to Check whether its even or not : ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is : "+ result);
        sc.close();

    }
}
