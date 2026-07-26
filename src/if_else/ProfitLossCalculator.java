package if_else;
import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price (CP): ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price (SP): ");
        double sp = sc.nextDouble();

        if (sp > cp) {
            double profit = sp - cp;
            System.out.println("Profit = ₹" + profit);
        } else if (sp < cp) {
            double loss = cp - sp;
            System.out.println("Loss = ₹" + loss);
        } else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}