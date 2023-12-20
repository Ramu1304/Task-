package task4;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class to represent a person with an age
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to validate the age
    public void validateAge() throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age validation successful!");
        }
    }
}

 class AgeValidationProgram {
    public static void main(String[] args) {
        // Simulate user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for name and age
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int age;
        while (true) {
            try {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();

                // Validate age and handle InvalidAgeException
                Person person = new Person(name, age);
                person.validateAge();

                break; // Exit the loop if age validation is successful
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Consume the newline character
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer for age.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}