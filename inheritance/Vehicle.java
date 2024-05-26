package inheritance;
// Vehicle.java
public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("The vehicle is starting");
    }

    public void stop() {
        System.out.println("The vehicle is stopping");
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
