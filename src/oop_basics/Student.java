package oop_basics;

public class Student {
    private int rollNumber;
    private String name;
    private double marks;

    public Student() {
        this.rollNumber = 0;
        this.name = "Unknown";
        this.marks = 0.0;
    }
    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        setMarks(marks);
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public String getName() {
        return name;
    }
    public double getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setMarks(double marks) {
        if (marks >= 0.0 && marks <= 100.0) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks: must be between 0 and 100.");
        }
    }
    public char calculateGrade() {
        if (marks >= 90) {
            return 'o';
        } else if (marks >= 80) {
            return 'A';
        } else if (marks >= 60) {
            return 'b';
        } else if (marks >= 40){
            return 'C';
        } else {
            return 'F';
        }
    }
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
