package task4;

public class ArrayIndexOutOfBoundsExceptionExample {
	
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            // Attempt to access an array element with an index that is out of bounds
            int element = numbers[5];
            System.out.println("Value: " + element);  // This line will not be reached
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}


