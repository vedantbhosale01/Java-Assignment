import java.util.Scanner;

public class Containment {
    // Main method for demonstration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a student using the default constructor
        Student s1 = new Student();
        System.out.println("Student 1 (Default Constructor):");
        s1.displayStudent();

        // Create a student and accept details
        Student s2 = new Student();
        s2.acceptStudent(scanner);
        System.out.println("\nStudent 2 (Accepted Details):");
        s2.displayStudent();

        // Create a student using the parameterized constructor
        Date dob3 = new Date(15, 8, 2003);
        Student s3 = new Student("Alice Smith", dob3);
        System.out.println("\nStudent 3 (Parameterized Constructor):");
        s3.displayStudent();

        scanner.close();
    }
}
class Date {
    private int day;
    private int month;
    private int year;

    // Default constructor
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    // Parameterized constructor
    public Date(int day, int month, int intYear) {
        this.day = day;
        this.month = month;
        this.year = intYear;
    }

    // Accept method for Date
    public void acceptDate(Scanner scanner) {
        System.out.print("Enter day (DD): ");
        this.day = scanner.nextInt();
        System.out.print("Enter month (MM): ");
        this.month = scanner.nextInt();
        System.out.print("Enter year (YYYY): ");
        this.year = scanner.nextInt();
    }

    // Display method for Date
    public void displayDate() {
        System.out.print(String.format("%02d/%02d/%d", day, month, year));
    }
}
// Student class
class Student {
    private static int nextRollNumber = 1001; // Starting roll number
    private int studentRollNumber;
    private String studentName;
    private Date dateOfBirth;

    // Default constructor
    public Student() {
        this.studentRollNumber = generateRollNumber();
        this.studentName = "N/A";
        this.dateOfBirth = new Date(); // Initializes with Date's default
    }

    // Parameterized constructor
    public Student(String studentName, Date dateOfBirth) {
        this.studentRollNumber = generateRollNumber();
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
    }

    // Method to generate roll number
    private static int generateRollNumber() {
        return nextRollNumber++;
    }

    // Accept method for Student
    public void acceptStudent(Scanner scanner) {
        System.out.println("--- Enter Student Details ---");
        // Roll number is automatically generated, no need to accept from user
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter Student Name: ");
        this.studentName = scanner.nextLine();
        System.out.println("Enter Date of Birth:");
        this.dateOfBirth.acceptDate(scanner);
    }

    // Display method for Student
    public void displayStudent() {
        System.out.println("--- Student Details ---");
        System.out.println("Roll Number: " + studentRollNumber);
        System.out.println("Name: " + studentName);
        System.out.print("Date of Birth: ");
        dateOfBirth.displayDate();
        System.out.println(); // New line after displaying DOB
    }
}
