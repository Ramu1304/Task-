package task3;

public class Circle {
	
	private double radius;

    public Circle() {
        this.radius = 0;
    }

    // Two-argument constructor
    public Circle(double radius) {
        // Constructor with a parameter to set the radius
        this.radius = radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Example usage
    public static void main(String[] args) {
        // Create an instance of the Circle class using the no-argument constructor
        Circle circle1 = new Circle();
        
        // Calculate and display the circumference
        System.out.println("Circumference (circle1): " + circle1.calculateCircumference());

        // Create an instance of the Circle class using the two-argument constructor
        Circle circle2 = new Circle(5.0);

        // Calculate and display the circumference
        System.out.println("Circumference (circle2): " + circle2.calculateCircumference());
    }

}
