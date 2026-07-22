package variables;
import java.util.Scanner;

public class ConvertTotalDaysIntoYearsMonthsDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of days: ");
        int total_days = scanner.nextInt();

        int years = total_days / 365;
        int remaining_days = total_days % 365;

        int months = remaining_days / 30;
        remaining_days = remaining_days % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + remaining_days);

        scanner.close();
    }
}