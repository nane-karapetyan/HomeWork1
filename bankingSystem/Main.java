package bankingSystem;
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        try {
            System.out.println("Attempting to withdraw 600...");
            account.withdraw(600.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: Insufficient funds.");
            System.out.println("You need " + e.getShortfall() + " more.");
        }
    }
}