package if_else;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subjects in order of 'Python Programming','NoSQL','ADS','Research Computing','Distributed System': ");
        double subject1 = sc.nextDouble();
        double subject2 = sc.nextDouble();
        double subject3 = sc.nextDouble();
        double subject4 = sc.nextDouble();
        double subject5 = sc.nextDouble();
        double total_marks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (total_marks / 500) * 100;
        System.out.println("Total marks: " + total_marks);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("You have secured O Grade");
        } else if (percentage >= 75) {
            System.out.println("You have secured A Grade");
        } else if (percentage >= 60) {
            System.out.println("You have secured B Grade");
        } else if (percentage >= 40) {
            System.out.println("You have secured C Grade");
        } else {
            System.out.println("You have Failed");
        }

        sc.close();
    }
}