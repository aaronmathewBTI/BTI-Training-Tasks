package Day2;
 
import java.util.Scanner;
 
public class Activity03Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();
        sc.nextLine(); // Consume newline
 
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
 
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
 
        // Initialize the BankAccount object using the constructor
        BankAccount account = new BankAccount(accNum, name, balance);
 
        System.out.print("Enter number of transactions(Max 10): ");
        int numTransactions = sc.nextInt();
 
        // Limit transactions to 10
        if (numTransactions > 10) {
            numTransactions = 10;
        }
 
        for (int i = 1; i <= numTransactions; i++) {
            System.out.print("Transaction " + i + " - Type (1: Deposit, 2: Withdraw): ");
            int type = sc.nextInt();
            System.out.print("Amount: ");
            double amount = sc.nextDouble();
 
            if (type == 1) {
                account.deposit(amount);
            } else if (type == 2) {
                account.withdraw(amount);
            }
        }
 
        // Display results
        System.out.println("\nExpected Output:");
        account.displayAccount();
        account.printMiniStatement();
 
        sc.close();
    }
}
 
class BankAccount {
    // Private instance variables
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String[] miniStatement;
   
    // Tracking variables for fixed-size circular history
    private int count = 0;
    private int head = 0;
 
    // Constructor initialization
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.miniStatement = new String[5]; // Array of size 5
    }
 
    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }
 
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
 
    public String getAccountHolderName() {
        return accountHolderName;
    }
 
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
 
    // Add a record to the fixed-size 5-element array
    private void addLog(String log) {
        if (count < 5) {
            miniStatement[count] = log;
            count++;
        } else {
            // Overwrites the oldest entry using circular logic
            miniStatement[head] = log;
            head = (head + 1) % 5;
        }
    }
 
    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        addLog("Deposited: " + amount);
    }
 
    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            addLog("Withdrew: " + amount);
        }
    }
 
    // Display basic account attributes
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.printf("Balance: %.2f\n", balance);
    }
 
    // Prints last 5 elements starting from chronological order
    public void printMiniStatement() {
        System.out.println("Mini Statement");
        if (count < 5) {
            for (int i = 0; i < count; i++) {
                System.out.println(miniStatement[i]);
            }
        } else {
            // Output sorted sequentially from the current head pointer position
            for (int i = 0; i < 5; i++) {
                int index = (head + i) % 5;
                System.out.println(miniStatement[index]);
            }
        }
    }
}
 
 