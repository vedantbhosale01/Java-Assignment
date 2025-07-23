public class ExceptionHandling {
    public static void main(String[] args) {
        
        Account ac = new Account();
        ac.deposit(20000.00);
        try {
            ac.withdraw(16000);
        } catch (Exception e) {
            System.out.println("You can not withdraw over 15K ");
        }
    }
}
 class  Account {

    private double balance;

    public void deposit(double ammount){
        balance = balance + ammount;
        System.out.println(balance);
    }

    public void withdraw(double ammount){
        if (ammount <= balance) {
            if (ammount > 15000.00) {
                throw new RuntimeException("Amout shold less then 15k");
            }
            balance = balance - ammount;
            System.out.println(balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }

}
