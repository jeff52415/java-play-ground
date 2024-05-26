package fundamentals;

// InstanceVariable.java

public class InstanceVariable {

    // Inner class definition for BankAccount
    static class BankAccount {
        // Instance variables
        private String accountNumber;
        private double balance;

        // Constructor to initialize the account number and balance
        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        // Method to deposit money into the account
        public void deposit(double amount) {
            // Accessing instance variable 'balance' directly
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Method to withdraw money from the account
        public void withdraw(double amount) {
            // Accessing instance variable 'balance' directly
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }

        // Method to get the current balance
        public double getBalance() {
            // Accessing instance variable 'balance' directly
            return balance;
        }

        // Method to get the account number
        public String getAccountNumber() {
            // Accessing instance variable 'accountNumber' directly
            return accountNumber;
        }
    }

    public static void main(String[] args) {
        // Create a new bank account with an initial balance
        BankAccount myAccount = new BankAccount("123456789", 1000.00);

        // Display the account number and initial balance
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        // Deposit money into the account
        myAccount.deposit(200.00);
        System.out.println("Balance after deposit: $" + myAccount.getBalance());

        // Withdraw money from the account
        myAccount.withdraw(150.00);
        System.out.println("Balance after withdrawal: $" + myAccount.getBalance());

        // Attempt to withdraw an invalid amount
        myAccount.withdraw(2000.00);
        System.out.println("Balance after invalid withdrawal: $" + myAccount.getBalance());
    }
}
