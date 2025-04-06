package VehicleManagementSystem;

public class Vehicle {
    private int maxSpeed;
    private String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayDetails(){
        System.out.println("max speed is " + maxSpeed);
        System.out.println("model is " + model);
    }
}
