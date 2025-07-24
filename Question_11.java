// Superclass: Employee
class Employee {
    int empId;
    String name;
    double basicSalary;

    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateGrossSalary() {
        return basicSalary;
    }

    public double calculateNetSalary() {
        double gross = calculateGrossSalary();
        double pf = 0.125 * basicSalary;
        return gross - pf;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}


class Manager extends Employee {
    double petrolAllowance;
    double foodAllowance;
    double otherAllowance;

    public Manager(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);  // use of super keyword
        this.petrolAllowance = 0.08 * basicSalary;
        this.foodAllowance = 0.12 * basicSalary;
        this.otherAllowance = 0.04 * basicSalary;
    }

    @Override
    public double calculateGrossSalary() {
        return basicSalary + petrolAllowance + foodAllowance + otherAllowance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Petrol Allowance: " + petrolAllowance);
        System.out.println("Food Allowance: " + foodAllowance);
        System.out.println("Other Allowance: " + otherAllowance);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}


class MarketingExecutive extends Employee {
    int kilometersTravelled;
    double tourAllowance;
    final double telephoneAllowance = 2000;

    public MarketingExecutive(int empId, String name, double basicSalary, int kilometersTravelled) {
        super(empId, name, basicSalary);  // use of super keyword
        this.kilometersTravelled = kilometersTravelled;
        this.tourAllowance = kilometersTravelled * 5.0;
    }

    @Override
    public double calculateGrossSalary() {
        return basicSalary + tourAllowance + telephoneAllowance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kilometers Travelled: " + kilometersTravelled);
        System.out.println("Tour Allowance: " + tourAllowance);
        System.out.println("Telephone Allowance: " + telephoneAllowance);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

// Client Code
public class Question_11{
    
    
    public static void printObjects(Employee e) {
        e.display();  
        System.out.println("--");
    }

    public static void main(String[] args) {
        Manager manager = new Manager(101, "Alice", 50000);
        MarketingExecutive exec = new MarketingExecutive(102, "Bob", 40000, 300);

        System.out.println("--- Printing via printObjects method ---");
        printObjects(manager);  // Pass Manager object
        printObjects(exec);     // Pass MarketingExecutive object
    }
}
