public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("nitish singh", "bullet java 600");
        v1.displayDetails();
        Vehicle.updateRegistrationFee(15000);
        v1.displayDetails();

    }
}

class Vehicle {
    private String ownerName;
    private String vehicleType;

    private  static  int registrationFee = 900;

    //constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(int updatedRegistrationFee) {
          registrationFee = updatedRegistrationFee;
    }
    void displayDetails() {
        System.out.println("owner name is " + ownerName);
        System.out.println("vehicle type  "+ vehicleType);
        System.out.println("registration fee is $" + registrationFee);
    }
    }


