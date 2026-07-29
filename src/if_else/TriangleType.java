package if_else;
import java.util.*;

public class TriangleType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int s1 = sc.nextInt();
        System.out.print("Enter second side: ");
        int s2 = sc.nextInt();
        System.out.print("Enter third side: ");
        int s3 = sc.nextInt();

        if (s1 == s2 && s1 == s3) {
            System.out.println("Equilateral Triangle");
        } else if (s1 == s2 || s2 == s3 || s1 == s3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

        sc.close();
    }
}