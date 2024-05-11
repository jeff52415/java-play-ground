// Define a simple class
public class Constructor {
    // Properties (fields)
    String breed;
    int age;

    // Constructor
    // A constructor is a special method in a class that is called when an object of that class is created. It is primarily used to initialize the object's properties.
    // The constructor has the same name as the class and does not have a return type.
    // If no constructor is defined in a class, Java provides a default constructor (no-argument constructor) that initializes the object's properties to their default values.
    public Constructor(String breed, int age) {
        // Initialize properties
        this.breed = breed;
        this.age = age;
    }

    // Method
    public void bark() {
        System.out.println("Woof! Woof!");
    }

    // Main method to demonstrate object creation
    public static void main(String[] args) {
        // Create an object (instance) of the Dog class
        Constructor myDog = new Constructor("Labrador", 3);
        
        // Call method on the object
        myDog.bark();
        System.out.println("Breed: " + myDog.breed + ", Age: " + myDog.age);
    }
}
