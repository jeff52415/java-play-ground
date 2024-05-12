// File: Car.java
package inherit;

// Car class extends Vehicle class
public class Car extends Vehicle {
    // Additional property specific to cars
    // private keyword restricts access to this property to the Car class only
    // This property is not accessible in the Vehicle class or any other class
    private int numberOfDoors;

    // Constructor to initialize Car properties (including inherited properties)
    // set default model and year to null and 0
    public Car(String model, int year, int numberOfDoors) {
        // Call the constructor of the superclass (Vehicle)
        super(model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Constructor with default year (2024)
    public Car(String model, int numberOfDoors) {
        this(model, 2024, numberOfDoors);  // Call the primary constructor
    }

    // Override method to display car information
    @Override
    public void displayInfo() {
        // Call the superclass method to print model and year
        super.displayInfo();
        // Add the specific car information
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 2022, 4);
        // Call the displayInfo method
        myCar.displayInfo();

        // Create another Car object
        Car anotherCar = new Car("Honda", 2);
        // Call the displayInfo method
        anotherCar.displayInfo();
    }
}
