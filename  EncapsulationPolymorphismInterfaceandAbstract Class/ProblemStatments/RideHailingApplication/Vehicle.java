package RideHailingApplication;

abstract class Vehicle {
    private String vehicleID;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleID, String driverName, double ratePerKm) {
        this.vehicleID = vehicleID;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
    public  abstract double   calculateFare(double distance);

    public void getVehicleDetails(){
        System.out.println("vehicle id is " + getVehicleID());
        System.out.println("driver name is " + getDriverName());
        System.out.println("rate per km is " + getRatePerKm());
    }


}
