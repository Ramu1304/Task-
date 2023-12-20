package task4;

public class StringIndexOutOfBoundsExceptionExample {
	
	public static void main(String[] args) {
        String text = "Hello";

        try {
            // Attempt to access a character with an index that is out of bounds
            char character = text.charAt(10);
            System.out.println("Character: " + character);  // This line will not be reached
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the StringIndexOutOfBoundsException
            System.out.println("Error: String index is out of bounds.");
        }
    }

}
