import java.util.Scanner;

public class ClassesAndObjects {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AccountHolder[] accounts = new AccountHolder[10];
        int count = 0;

         while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add account holder");
            System.out.println("2. Display all account holders");
            System.out.println("3. Deposit to an account");
            System.out.println("4. Withdraw from an account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < accounts.length) {
                        System.out.print("Enter account number: ");
                        int accNum = sc.nextInt();
                        sc.nextLine();  // consume newline
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter initial balance: ");
                        double bal = sc.nextDouble();
                        accounts[count] = new AccountHolder(accNum, name, bal);
                        count++;
                        System.out.println("Account created successfully.");
                    } else {
                        System.out.println("Maximum account limit reached.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Account Holder Details ---");
                    for (int i = 0; i < count; i++) {
                        accounts[i].displayDetails();
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int accNumDeposit = sc.nextInt();
                    boolean foundDeposit = false;
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getAccountNumber() == accNumDeposit) {
                            System.out.print("Enter amount to deposit: ");
                            double amount = sc.nextDouble();
                            accounts[i].deposite(amount);
                            foundDeposit = true;
                            break;
                        }
                    }
                    if (!foundDeposit) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int accNumWithdraw = sc.nextInt();
                    boolean foundWithdraw = false;
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getAccountNumber() == accNumWithdraw) {
                            System.out.print("Enter amount to withdraw: ");
                            double amount = sc.nextDouble();
                            accounts[i].withdraw(amount);
                            foundWithdraw = true;
                            break;
                        }
                    }
                    if (!foundWithdraw) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
         }
        
    }
}
class AccountHolder{

    int accountNumber;
    double accountbalance;
    String name;

    // Constructor
    public AccountHolder(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountbalance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getAccountbalance() {
        return accountbalance;
    }
    public void setAccountbalance(double accountbalance) {
        this.accountbalance = accountbalance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //to deposite
    public void deposite(double ammount){
        accountbalance = accountbalance + ammount;
        System.out.println("Ammount is deposited successfully: ");
    }

    //to witdraw
    public void withdraw(double ammount){
        if (ammount <= accountbalance) {
            accountbalance = accountbalance - ammount;
            System.out.println("Ammount withdrwan successfully");
        }else{
            System.out.println("insufficient balance");
        }
    }

    //to Display all details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Name: " + name + ", Balance: ₹" + accountbalance);
    }

    
}