package VehicleManagementSystem;

public class PetrolVehicle extends Vehicle implements Refuelable{
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("this type of vechile needs petrol");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("petrol type vehicles.");
    }
}
