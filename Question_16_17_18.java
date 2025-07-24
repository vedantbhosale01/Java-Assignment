import java.util.*;


class Student implements Comparable<Student> {
    private int rollno;
    private String name;
    private double percentage;
    private Set<String> skillset;

    
    public Student(int rollno, String name, double percentage, Set<String> skillset) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        this.skillset = skillset;
    }

    
    public int getRollno() { return rollno; }
    public String getName() { return name; }
    public double getPercentage() { return percentage; }
    public Set<String> getSkillset() { return skillset; }

    
    public void display() {
        System.out.println("Roll No: " + rollno + ", Name: " + name + ", Percentage: " + percentage);
        System.out.println("Skills: " + skillset);
    }

    
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.percentage, this.percentage);
    }
}


class UtilityList {
    private List<Student> list = new ArrayList<>();

    
    public void createList(Scanner sc) {
        System.out.print("How many students? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No: ");
            int rollno = sc.nextInt();
            sc.nextLine(); // clear buffer
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Percentage: ");
            double percentage = sc.nextDouble();
            sc.nextLine(); // clear buffer
            System.out.print("Enter Skills (comma separated): ");
            String[] skills = sc.nextLine().split(",");
            Set<String> skillset = new HashSet<>(Arrays.asList(skills));

            Student s = new Student(rollno, name, percentage, skillset);
            list.add(s);
        }
    }

    
    public void printList() {
        for (Student s : list) {
            s.display();
        }
    }

    public List<Student> getList() {
        return list;
    }
}


class UtilityReport {
    private Map<String, Double> m = new HashMap<>();

    public void showReport(List<Student> studentList) {
        for (Student s : studentList) {
            m.put(s.getName(), s.getPercentage());
        }
        System.out.println("----- Student Report -----");
        for (Map.Entry<String, Double> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}


class PercentageComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getPercentage(), s2.getPercentage());
    }
}


public class Question_16_17_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtilityList uList = new UtilityList();

        uList.createList(sc);      
        System.out.println("\nAll Students:");
        uList.printList();         

        
        UtilityReport report = new UtilityReport();
        report.showReport(uList.getList());

        
        Collections.sort(uList.getList(), new PercentageComparator());
        System.out.println("\nSorted by Percentage (Ascending) [Comparator]:");
        uList.printList();

        
        Collections.sort(uList.getList()); 
        System.out.println("\nSorted by Percentage (Descending) [Comparable]:");
        uList.printList();

        sc.close();
    }
}

