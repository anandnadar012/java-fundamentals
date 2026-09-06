package oop_basics;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee.printCompanyHeader();

        Employee e1 = new Employee("Dave", 50000);
        Employee e2 = new Employee("Emma", 65000);
        Employee e3 = new Employee("Frank", 45000);

        e1.raiseSalary(10.0);

        System.out.println("Employee ID: " + e1.getId());
        System.out.println("Employee Name: " + e1.getName());
        System.out.println("Employee Salary: " + e1.getSalary());

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        e3.displayDetails();

        System.out.println();
        System.out.println("Total Employees: " + Employee.getTotalEmployees());
    }
}