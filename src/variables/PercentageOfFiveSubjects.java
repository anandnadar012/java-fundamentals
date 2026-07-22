package variables;

import java.util.Scanner;
public class PercentageOfFiveSubjects {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks of subjects in order of 'English','Hindi','Marathi','maths','science :");
        double subject1 = scanner.nextDouble();
        double subject2 = scanner.nextDouble();
        double subject3 = scanner.nextDouble();
        double subject4 = scanner.nextDouble();
        double subject5 = scanner.nextDouble();

        double total_marks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (total_marks*500)/100;
        System.out.println("Total marks:" + total_marks);
        System.out.println("Percentage:" + percentage);

    }
}
