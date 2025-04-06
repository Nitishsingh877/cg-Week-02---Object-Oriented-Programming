package VehicleManagementSystem;

public class ElectricVehicle extends  Vehicle{
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void charge(){
        System.out.println("please plug the charger!!");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("these are charging type models");
    }
}
