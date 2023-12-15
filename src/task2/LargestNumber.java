package task2;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Find the largest number
        double largestNumber = findLargestNumber(num1, num2, num3);

        // Output the result
        System.out.println("The largest number is: " + largestNumber);

        scanner.close();
    }

    // Function to find the largest number among three numbers
    private static double findLargestNumber(double num1, double num2, double num3) {
        double largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        return largest;
    }

}
