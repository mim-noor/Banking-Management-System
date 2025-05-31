import java.util.Date;

public class Account {
    private String accountNumber;
    private String accountType;
    private double balance;
    private Date date;
    private String status;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void getAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Status: " + status);
    }

    // Constructors, getters, setters
}

