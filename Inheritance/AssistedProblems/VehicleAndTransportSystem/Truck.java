package VehicleAndTransportSystem;

public class Truck extends Vehicle{
    private int wheels;
    private int fuelStorage;

    public Truck(int maxSpeed, String fuelType, int wheels, int fuelStorage) {
        super(maxSpeed, fuelType);
        this.wheels = wheels;
        this.fuelStorage = fuelStorage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("wheel having truck "+ wheels);
        System.out.println("fuel storage is "+ fuelStorage);
    }
}
