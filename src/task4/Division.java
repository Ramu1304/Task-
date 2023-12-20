package task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the first integer
            System.out.print("Enter the first integer: ");
            int numerator = scanner.nextInt();

            // Read the second integer
            System.out.print("Enter the second integer: ");
            int denominator = scanner.nextInt();

            // Perform division
            double result = divide(numerator, denominator);

            // Display the result
            System.out.println("Result of division: " + result);

        } catch (InputMismatchException e) {
            // Handle input mismatch exception (non-integer input)
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

    // Method to perform division
    private static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            // Throw an exception if the denominator is zero
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }

}
