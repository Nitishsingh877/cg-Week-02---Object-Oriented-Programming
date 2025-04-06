package VehicleManagementSystem;

import RestaurantManagementSystem.Person;

public class Main {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle(150,"tata elxi");
        electricVehicle.charge();
        electricVehicle.displayDetails();


        System.out.println();


        PetrolVehicle petrolVehicle = new PetrolVehicle(250,"BMW");
        petrolVehicle.refuel();
        petrolVehicle.displayDetails();
    }
}
