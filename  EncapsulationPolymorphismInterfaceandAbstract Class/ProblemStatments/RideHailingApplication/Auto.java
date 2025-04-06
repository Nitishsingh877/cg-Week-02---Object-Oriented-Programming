package RideHailingApplication;

public class Auto extends  Vehicle implements  GPS{
    private String currentLocation;
    public Auto(String vehicleID, String driverName, double ratePerKm) {
        super(vehicleID, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm()*distance + 5;
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

