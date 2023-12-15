package task2;

import java.util.Scanner;

public class PalindromeorNot {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input string is a palindrome Ex : mom 
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        
        str = str.replaceAll("\\s", "").toLowerCase();

        // Length of the string
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
             
                return false;
            }
        }

     
        return true;
    }

}
