class ClassesAndObject_02 {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Vedant", 88.5);
        Student s2 = new Student(102, "Rushikesh", 91.0);

        
        System.out.println(s1);
        System.out.println(s2);
        
        System.out.println("The number of object: " + Student.count);
        
    }
}
class  Student {

    private int rollNo;
    private String name;
    private double percentage;

    public static int count = 0;

    // Constructor
    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
        count++; // Increment object count
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    

     // toString method
    public String toString() {

        return "Roll No: " + rollNo + ", Name: " + name + ", Percentage: " + percentage;
    }
    }
    



