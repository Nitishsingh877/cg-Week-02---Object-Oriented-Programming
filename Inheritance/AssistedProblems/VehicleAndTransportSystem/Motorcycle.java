package VehicleAndTransportSystem;

public class Motorcycle extends  Vehicle{
    private String modelName;
    private int maxSpeeds;

    public Motorcycle(int maxSpeed, String fuelType, String modelName, int maxSpeeds) {
        super(maxSpeed, fuelType);
        this.modelName = modelName;
        this.maxSpeeds = maxSpeeds;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("model name is "+ modelName);
        System.out.println("max speed is "+ maxSpeeds);
    }
}
