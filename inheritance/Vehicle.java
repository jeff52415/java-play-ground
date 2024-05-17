// File: Vehicle.java
package inheritance;

public class Vehicle {
    // Common properties for all vehicles
    // Protected keyword allows subclasses to access these properties, without protected, subclasses cannot access these properties
    // Replace protected with public to make these properties accessible to all classes
    protected String model;
    protected int year;

    // Constructor to initialize Vehicle properties
    // model and year are required to create a Vehicle object, they are passed as arguments to the constructor
    // Is't similar to the self.__init__ method in Python? Yes, the constructor is similar to the __init__ method in Python
    // this keyword is used to refer to the current object (Vehicle object), similar to self in Python
    public Vehicle(String model, int year) {
        // set default model and year to null and 0
        this.model = model;
        this.year = year;
    }

    // Constructor with a default year (2024)
    public Vehicle(String model) {
        this("BMW", 2024);  // Call the main constructor, passing in 2024 as the default year
    }

    // Method to display the vehicle information
    public void displayInfo() {
        System.out.println("Vehicle Model: " + model + ", Year: " + year);
    }
}
