
class Employee {
    int empId;
    String name;
    String dob;

    public Employee(int empId, String name, String dob) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }

    public double calculateSalary() {
        return 0.0;
    }
}


class WageEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    public WageEmployee(int empId, String name, String dob, int hoursWorked, double ratePerHour) {
        super(empId, name, dob);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Rate per Hour: ₹" + ratePerHour);
        System.out.println("Salary: ₹" + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}


class SalesPerson extends WageEmployee {
    int itemsSold;
    double commissionPerItem;

    public SalesPerson(int empId, String name, String dob, int hoursWorked, double ratePerHour,
                       int itemsSold, double commissionPerItem) {
        super(empId, name, dob, hoursWorked, ratePerHour);
        this.itemsSold = itemsSold;
        this.commissionPerItem = commissionPerItem;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Items Sold: " + itemsSold);
        System.out.println("Commission per Item: ₹" + commissionPerItem);
        System.out.println("Total Salary (including commission): ₹" + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return (hoursWorked * ratePerHour) + (itemsSold * commissionPerItem);
    }
}

// Main class
public class Question_10 {
    public static void main(String[] args) {
        System.out.println("Wage Employee");
        WageEmployee wageEmp = new WageEmployee(101, "Alice", "01/01/1990", 40, 200);
        wageEmp.display();

        System.out.println("\n Sales Person");
        SalesPerson salesEmp = new SalesPerson(102, "Bob", "10/10/1985", 40, 200, 50, 20);
        salesEmp.display();
    }
}
