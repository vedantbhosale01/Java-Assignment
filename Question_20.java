import java.util.Scanner;

// Thread t1: Prints next 10 incremented values
class IncrementThread extends Thread {
    int number;

    public IncrementThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("\nThread t1: Next 10 incremented values:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + i);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}

// Thread t2: Prints multiplication table
class MultiplicationThread extends Thread {
    int number;

    public MultiplicationThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("\nThread t2: Multiplication table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}

// Main class to start both threads
public class Question_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = sc.nextInt();

        IncrementThread t1 = new IncrementThread(userNumber);
        MultiplicationThread t2 = new MultiplicationThread(userNumber);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish (optional)
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sc.close();
        System.out.println("\nBoth threads finished execution.");
    }
}

