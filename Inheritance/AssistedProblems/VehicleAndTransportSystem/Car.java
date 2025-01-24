package VehicleAndTransportSystem;

public class Car extends  Vehicle{

    private int seatCapacity;
    private String modelName;

    public Car(int maxSpeed, String fuelType, int seatCapacity, String modelName) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
        this.modelName = modelName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("seat capacity for car is "+ seatCapacity);
        System.out.println("model name for car is "+ modelName);
    }
}
