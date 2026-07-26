package if_else;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();
        double bill;

        if (units <= 0) {
            System.out.println("Invalid units");
        } else if (units <= 100) {
            bill = units * 2;
            System.out.println("Total Bill: ₹" + bill);
        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
            System.out.println("Total Bill: ₹" + bill);
        } else if (units <= 300) {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
            System.out.println("Total Bill: ₹" + bill);
        } else {
            bill = (100 * 2) + (100 * 3) + (100 * 5) + (units - 300) * 7;
            System.out.println("Total Bill: ₹" + bill);
        }

        sc.close();
    }
}