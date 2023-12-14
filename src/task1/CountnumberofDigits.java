package task1;

import java.util.Scanner;

public class CountnumberofDigits {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);

        System.out.println("The number of digits in " + number + " is: " + digitCount);

           scanner.close();
    }
        public static int countDigits(int num) {
      
        num = Math.abs(num);

        if (num == 0) {
            return 1; // If the number is 0, it has one digit
        }

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

}
