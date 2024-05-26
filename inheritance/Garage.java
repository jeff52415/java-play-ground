// File: Garage.java
package inheritance;

// Garage.java
public class Garage {
    private Vehicle[] vehicles;
    private int count;

    public Garage(int size) {
        vehicles = new Vehicle[size];
        count = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        if (count < vehicles.length) {
            vehicles[count] = vehicle;
            count++;
        } else {
            System.out.println("Garage is full");
        }
    }

    public void showVehicles() {
        for (int i = 0; i < count; i++) {
            Vehicle vehicle = vehicles[i];
            System.out.println("Vehicle " + (i + 1) + ": " + vehicle.getBrand() + " (" + vehicle.getYear() + ")");
        }
    }
}
