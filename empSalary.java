/* Question 3: Write a Java program to implement Employee Salary Classification.
Create a class Employee with attributes empId, name, and salary.
Determine salary category:
- Salary > 50000 => High Salary
- Salary 20000 to 50000 => Medium Salary
- Salary < 20000 => Low Salary */

import java.util.*;

class Employee {
    int empId;
    String name;
    double salary;

   
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    
    public String getSalaryCategory() {
        if (salary > 50000) {
            return "High Salary";
        } else if (salary >= 20000 && salary <= 50000) {
            return "Medium Salary";
        } else {
            return "Low Salary";
        }
    }

   
    public void displayDetails() {
        System.out.println("Employee Id : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println("Category    : " + getSalaryCategory());
    }
}

public class empSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Id : ");
        int empId = scanner.nextInt();

        System.out.print("Enter Name : ");
        String name = scanner.next();

        System.out.print("Enter Salary : ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, name, salary);

        System.out.println("\nEmployee Details");
        employee.displayDetails();

        scanner.close();
    }
}