// Car.java
package inheritance;
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("The car is starting");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
