// File: Garage.java
package inheritance;

public class Garage {
    // Main method to demonstrate inheritance and import
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle genericVehicle = new Vehicle("Truck", 2015);

        System.out.println("Generic Vehicle:");
        genericVehicle.displayInfo();

        // Create a Car object, which is a subclass of Vehicle
        Car myCar = new Car("Sedan", 2023, 4);
        System.out.println("\nMy Car:");
        myCar.displayInfo();
    }
}
