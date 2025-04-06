package VehicleRentalSystem;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    //abstract methods
    abstract double calculateRentalCost(int days);

    //concrete methods

    public void  displayDetails(){
        System.out.println("vehicle number is "+ getVehicleNumber());
        System.out.println("type of vehicle is "+ getType());
        System.out.println("rental rate is " +getRentalRate());
    }

}
