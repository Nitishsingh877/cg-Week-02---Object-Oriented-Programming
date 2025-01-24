package VehicleAndTransportSystem;

public class Vehicle {
    private int maxSpeed;
    private String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("maxSpeed is "+ maxSpeed);
        System.out.println("fuel type is "+ fuelType);
    }
}
