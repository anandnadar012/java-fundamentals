package variables;
import java.util.Scanner;

public class ConvertMinutesIntoHoursAndMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total minutes: ");
        int totalMinutes = scanner.nextInt();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);

        scanner.close();
    }
}