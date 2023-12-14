package task1;

import java.util.Scanner;

public class SeniorcitizenorNot {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the person's age from the user
	        System.out.print("Enter the person's age: ");
	        int age = scanner.nextInt();

	        // Check if the person is a senior citizen
	        boolean isSeniorCitizen = checkSeniorCitizen(age);

	        // Display the result
	        if (isSeniorCitizen) {
	            System.out.println("The person is a senior citizen.");
	        } else {
	            System.out.println("The person is not a senior citizen.");
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Function to check if a person is a senior citizen
	    public static boolean checkSeniorCitizen(int age) {
	        final int SENIOR_CITIZEN_THRESHOLD = 60;
	        return age >= SENIOR_CITIZEN_THRESHOLD;
	    }
	}


