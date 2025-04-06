package VehicleAndTransportSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                 new Car(220,"petrol",5,"BMW"),
                new Truck(120,"disel",12,150),
                new Motorcycle(220,"petrol","NS-200",220)
        };
        for (Vehicle v:vehicles
             ) {
            v.displayInfo();
            System.out.println();
        }
    }
}
