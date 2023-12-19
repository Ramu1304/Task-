package task3;

public class Tea {

	
	protected boolean hotWater;
    protected boolean teaLeaves;
    // Constructor
    public Tea() {
        // By default, a basic tea is prepared with hot water and tea leaves
        this.hotWater = true;
        this.teaLeaves = true;
    }

    // Method to prepare basic tea with hot water and tea leaves
    public void prepareTea() {
        System.out.println("Basic tea is prepared with hot water and tea leaves.");
    }

    // Method to add milk to the tea
    public void addMilk() {
        if (hotWater && teaLeaves) {
            System.out.println("Milk is added to the tea.");
        } else {
            System.out.println("Cannot add milk before preparing basic tea.");
        }
    }

    // Method to add sugar to the tea
    public void addSugar() {
        if (hotWater && teaLeaves) {
            System.out.println("Sugar is added to the tea.");
        } else {
            System.out.println("Cannot add sugar before preparing basic tea.");
        }
    }

    // Example usage
    public static void main(String[] args) {
        // Create an instance of the Tea class
        Tea myTea = new Tea();

        // Prepare basic tea
        myTea.prepareTea();

        // Add milk and sugar
        myTea.addMilk();
        myTea.addSugar();
    }
}
