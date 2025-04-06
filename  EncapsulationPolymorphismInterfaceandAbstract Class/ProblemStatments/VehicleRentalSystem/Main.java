package VehicleRentalSystem;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

       Car car = new Car("jh01cl1146",750,"6264996cnjhsjb21");
       Bike bike = new Bike("mp04ca46650",220,"6565djd51");
       Truck truck = new Truck("jh034653",8000,"6262vsjjnvs565");

       vehicles.add(car);
       vehicles.add(bike);
       vehicles.add(truck);

        for (Vehicle v:vehicles
             ) {
            System.out.println("vehicle number is " + v.getVehicleNumber());
            System.out.println("rental rate is "+ v.getRentalRate());
            System.out.println("rental cost is " + v.calculateRentalCost(5));
            System.out.println("insurance cost is " + ((Insurable) v).calculateInsurance());
            System.out.println("insurance details are " + ((Insurable) v).getInsuranceDetails());
            System.out.println("------------------------------------");

        }
    }
}
