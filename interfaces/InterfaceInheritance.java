package interfaces;

interface Vehicle {
    void start();
    void stop();
}

interface ElectricVehicle extends Vehicle {
    void charge();
}

class Tesla implements ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Tesla is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Tesla is stopping.");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging.");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.start();
        tesla.stop();
        tesla.charge();
    }
}
