package task1;

import java.util.Scanner;

public class SwaptwoNumbers {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the first number from the user
	        
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        // Get the second number from the user
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        // Display the original values
	        System.out.println("Original values:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        // Swap the values using an additional variable
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;

	        // Display the swapped values
	        System.out.println("\nValues after swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        // Close the scanner
	        scanner.close();
	    }
	}

