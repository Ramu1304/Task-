package task3;

public class Account {
	
	 private double balance;

	    // No-argument constructor
	    public Account() {
	        // Default constructor, sets balance to 0
	        this.balance = 0;
	    }

	    // Two-argument constructor
	    public Account(double initialBalance) {
	        // Constructor with a parameter to set the initial balance
	        this.balance = initialBalance;
	    }

	    // Method to withdraw balance
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Remaining balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }

	    // Method to deposit balance
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }


	    public static void main(String[] args) {
	        // Create an instance of the Account class using the no-argument constructor
	        Account account1 = new Account();
	        
	        // Deposit and withdraw from the account
	        account1.deposit(1000.0);
	        account1.withdraw(500.0);

	        // Create an instance of the Account class using the two-argument constructor
	        Account account2 = new Account(2000.0);

	        // Deposit and withdraw from the second account
	        account2.deposit(1500.0);
	        account2.withdraw(1000.0);
	    }

}
