package task2;

import java.util.Scanner;

public class ReversedString {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();   

        // Reverse the string using a loop
        String reversedString = reverseString(input);

        // Output the reversed string
        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }

    // Function to reverse a string using a loop
    private static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Length of the array
        int length = charArray.length;

                for (int i = 0; i < length / 2; i++) {
            // Swap characters at i and length - 1 - i
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }

                return new String(charArray);
    }

}
