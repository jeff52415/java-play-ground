package inheritance;

public class PolymorphismExample {
  public static void main(String[] args) {
      Garage garage = new Garage(5);

      Vehicle genericVehicle = new Vehicle("Generic Brand", 2020);
      Car myCar = new Car("Toyota", 2021, 4);

      garage.addVehicle(genericVehicle);
      garage.addVehicle(myCar);

      garage.showVehicles();

      // Demonstrating polymorphism
      Vehicle vehicleRef;

      vehicleRef = myCar;
      vehicleRef.start();  // Should call Car's start method
      vehicleRef.stop();   // Should call Car's stop method

      vehicleRef = genericVehicle;
      vehicleRef.start();  // Should call Vehicle's start method
      vehicleRef.stop();   // Should call Vehicle's stop method
  }
}
