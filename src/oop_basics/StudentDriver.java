package oop_basics;

public class StudentDriver {
    public static void main(String[] args) {

        // s1 using default constructor
        Student s1 = new Student();
        s1.setRollNumber(101);
        s1.setName("Alice");
        s1.setMarks(85.5);
        Student s2 = new Student(102, "Bob", 105.0);
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}