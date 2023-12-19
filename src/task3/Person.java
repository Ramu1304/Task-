package task3;

public class Person {
	
	private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Example usage
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person personInstance = new Person("John Doe", 25);

        // Access attributes using getter methods
        System.out.println("Name: " + personInstance.getName());
        System.out.println("Age: " + personInstance.getAge());
    }
}


