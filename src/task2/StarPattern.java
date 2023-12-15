package task2;

import java.util.Scanner;

public class StarPattern {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();
	        printStarPattern(numRows);

	        scanner.close();
	    }
	    private static void printStarPattern(int numRows) {
	        for (int i = 1; i <= numRows; i++) {
	            for (int j = 1; j < i; j++) {
	                System.out.print(" ");
	            }
	            System.out.print("*");
	            for (int j = i; j < numRows; j++) {
	                System.out.print(" ");
	            }
	            if (i < numRows) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}



