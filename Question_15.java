import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;

    // Default Constructor
    Employee() {
    }

    // Parameterized Constructor
    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Display employee details
    void display() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee by ID");
            System.out.println("3. Show All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();  // clear buffer
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                empList.add(new Employee(id, name, salary));
                System.out.println("Employee added.");
            } else if (choice == 2) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                boolean found = false;
                for (Employee e : empList) {
                    if (e.empId == id) {
                        sc.nextLine();  // clear buffer
                        System.out.print("Enter New Name: ");
                        e.name = sc.nextLine();
                        System.out.print("Enter New Salary: ");
                        e.salary = sc.nextDouble();
                        System.out.println("Employee updated.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Employee not found.");
                }
            } else if (choice == 3) {
                System.out.println("\nAll Employees:");
                for (Employee e : empList) {
                    e.display();
                }
            } else if (choice == 4) {
                System.out.println("Exiting.");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
