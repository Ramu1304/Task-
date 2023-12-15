package task2;

import java.util.Scanner;

public class NumberPattern {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();

	        // Print the pattern
	        printNumberPattern(numRows);

	        scanner.close();
	 }

	    private static void printNumberPattern(int numRows) {
	        int num = 1;

	        // Loop through each row
	        for (int i = 1; i <= numRows; i++) {
	            // Print the numbers for each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println(); // Move to the next line after each row
	        }


}
	    
}