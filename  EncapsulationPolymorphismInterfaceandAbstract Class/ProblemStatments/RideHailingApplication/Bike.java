package RideHailingApplication;

public class Bike extends  Vehicle implements  GPS{
    private String currentLocation;
    public Bike(String vehicleID, String driverName, double ratePerKm) {
        super(vehicleID, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm()*distance*0.8;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

