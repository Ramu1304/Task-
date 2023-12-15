package task2;

import java.util.Scanner;

public class GradingSystem {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the mark
        System.out.print("Enter the mark scored by the student: ");
        int mark = scanner.nextInt();

        // Check if the mark is valid
        if (mark > 100) {
            System.out.println("Invalid Input");
        } else {
            // Determine the grade based on the mark
            char grade = calculateGrade(mark);

            // Output the grade
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }

    // Function to calculate the grade based on the mark
    private static char calculateGrade(int mark) {
        char grade;
        
        if (mark <= 100) {
            grade = 's';
        }
         else if (mark >= 90 && mark <= 99) {
            grade = 'A';
        } else if (mark >= 80 && mark < 89) {
            grade = 'B';
        } else if (mark >= 70 && mark < 79) {
            grade = 'C';
        } else if (mark >= 60 && mark < 69) {
            grade = 'D';
        } else if (mark >= 50 && mark < 59) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        return grade;
    }

}
