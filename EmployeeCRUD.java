import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    
    private int id;
    private String name;
    private String department;
    private double salary;
    private int experience;

    Employee(int id, String name, String department,double salary, int experience) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void display() {
        System.out.println(id + " " + name + " " + department +" " + salary + " " + experience);
    }
}

class EmployeeCRUD {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        
        ArrayList<Employee> list = new ArrayList<Employee>();

        int choice;

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display Employees");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

              
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                System.out.print("Enter Experience: ");
                int experience = sc.nextInt();

                Employee e = new Employee(id, name, department, salary, experience );

                list.add(e);

                System.out.println("Employee Added");

            } else if (choice == 2) {

                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < list.size(); i++) {

                    Employee e = list.get(i);

                    if (e.getId() == id) {

                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        e.setName(sc.nextLine());

                        System.out.print("Enter New Department: ");
                        e.setDepartment(sc.nextLine());

                        System.out.print("Enter New Salary: ");
                        e.setSalary(sc.nextDouble());

                        System.out.print("Enter New Experience: ");
                        e.setExperience(sc.nextInt());

                        found = true;

                        System.out.println("Employee Updated");
                    }
                }

                if (found == false) {
                    System.out.println("Employee Not Found");
                }

            } else if (choice == 3) {

                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < list.size(); i++) {

                    if (list.get(i).getId() == id) {
                        list.remove(i);
                        found = true;
                        System.out.println("Employee Deleted");
                        break;
                    }
                }

                if (found == false) {
                    System.out.println("Employee Not Found");
                }

            } else if (choice == 4) {

                for (int i = 0; i < list.size(); i++) {
                    list.get(i).display();
                }

            } else if (choice == 5) {

              
                sc.nextLine();

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                System.out.print("Enter Minimum Salary: ");
                double salary = sc.nextDouble();

                boolean found = false;

                for (int i = 0; i < list.size(); i++) {

                    Employee e = list.get(i);

                    if (e.getDepartment().equals(department)&& e.getSalary() >= salary) {

                        e.display();
                        found = true;
                    }
                }

                if (found == false) {
                    System.out.println("Employee Not Found");
                }
            }

        } while (choice != 6);
    }
}
