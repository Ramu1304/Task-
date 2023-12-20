package task4;

import java.util.Scanner;

public class IncorrectPasswordException extends Exception  {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectPasswordException(String message) {
        super(message);
    }
}

// User class representing a user with a password
class User {
	
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method to validate the entered password
    public void login(String enteredPassword) throws IncorrectPasswordException {
        if (!password.equals(enteredPassword)) {
            throw new IncorrectPasswordException("Incorrect password. Please try again.");
        } else {
            System.out.println("Login successful!");
        }
    }
}

 class LoginSystem {
    public static void main(String[] args) {
        // Assume a user with a known password
        User user = new User("john_doe", "secret123");

        // Simulate user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the password
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        // Attempt to log in and handle IncorrectPasswordException
        try {
            user.login(enteredPassword);
        } catch (IncorrectPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}