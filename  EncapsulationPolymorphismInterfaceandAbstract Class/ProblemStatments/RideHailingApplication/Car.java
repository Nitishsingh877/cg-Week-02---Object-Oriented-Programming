package RideHailingApplication;

public class Car extends  Vehicle implements  GPS{
    private String currentLocation;
    public Car(String vehicleID, String driverName, double ratePerKm) {
        super(vehicleID, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm()*distance;
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
