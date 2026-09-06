package oop_basics;

public class Employee {
    private int id;
    private String name;
    private double salary;
    static int idCounter = 1000;
    static int totalEmployees = 0;
    public static final String COMPANY_NAME = "TechCorp";

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        id = ++idCounter;
        totalEmployees++;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static int getTotalEmployees(){
        return totalEmployees;
    }
    public static void printCompanyHeader(){
        System.out.println("=== " + COMPANY_NAME + " ===");
    }
    void raiseSalary(double percentage){
        double raise = salary * percentage / 100.0;
        salary += raise;
    }
    public void displayDetails() {
        System.out.println("Employee Id: " + id );
        System.out.println("Name: " + name );
        System.out.println("Salary: " + salary );
        System.out.println("Company Name: " + COMPANY_NAME);
    }
}
