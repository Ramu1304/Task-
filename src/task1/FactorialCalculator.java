package task1;

import java.util.Scanner;

public class FactorialCalculator {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter a number: ");
            
        int number = scanner.nextInt();

         long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the factorial of a number
    public static long calculateFactorial(int num) {
        if (num < 0) {
            return -1; // Invalid input for factorial
        }
        if (num == 0 || num == 1) {
            return 1; // Factorial of 0 and 1 is 1
        }

        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}
