public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle bmw = new Vehicle("nitish singh", "4 whheeler",5245694);
        Vehicle nano = new Vehicle("siddhu singh","nano",465862);

        Vehicle.setRegistrationFee(8500);

        if(bmw instanceof Vehicle) {
            System.out.println("yes bmw is instance of vehicle\n");
        }

        bmw.getVehicleDetails();
        System.out.println("\n");
        nano.getVehicleDetails();

    }
}

class Vehicle {
    public static double registrationFee;
    private String ownerName;
    private  String vehicleType;
    private long registrationNumber;

    //constructor
    public Vehicle(String ownerName, String vehicleType, long registrationNumber){
        this.ownerName =ownerName;
        this.registrationNumber =registrationNumber;
        this.vehicleType = vehicleType;
    }

    public static void setRegistrationFee(double newRegistrationFee) {
        registrationFee =newRegistrationFee;
    }

    public  void getVehicleDetails() {
        System.out.println("owner name is " + ownerName);
        System.out.println("registration number is "+ registrationNumber);
        System.out.println("vehicle type is "+ vehicleType);
        System.out.println("updated registration fee is " + registrationFee);
    }
}
