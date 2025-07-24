import java.util.Objects;

public class Question_13_14 {
    public static void main(String[] args) {
        try {
            Vehicle v1 = new Vehicle(101, "Car", 500000);
            Vehicle v2 = new Vehicle(101, "Car", 500000);
            Vehicle v3 = (Vehicle) v1.clone();  

            System.out.println("--- Vehicle 1 ---");
            v1.display();

            System.out.println("\n--- Vehicle 2 ---");
            v2.display();

            System.out.println("\n--- Vehicle 3 (Cloned from Vehicle 1) ---");
            v3.display();

            
            System.out.println("\nv1.equals(v2): " + v1.equals(v2));  
            System.out.println("v1.equals(v3): " + v1.equals(v3));  

            
            System.out.println("\nv1.hashCode(): " + v1.hashCode());
            System.out.println("v2.hashCode(): " + v2.hashCode());
            System.out.println("v3.hashCode(): " + v3.hashCode());

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }
    }
}


class Vehicle implements Cloneable {
    private int number;
    private String name;
    private double price;

    
    public Vehicle(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    
    public void display() {
        System.out.println("Vehicle Number: " + number);
        System.out.println("Vehicle Name: " + name);
        System.out.println("Vehicle Price: " + price);
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle v = (Vehicle) obj;
        return number == v.number &&
               Double.compare(v.price, price) == 0 &&
               name.equals(v.name);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(number, name, price);
    }

    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();  
    }
}

