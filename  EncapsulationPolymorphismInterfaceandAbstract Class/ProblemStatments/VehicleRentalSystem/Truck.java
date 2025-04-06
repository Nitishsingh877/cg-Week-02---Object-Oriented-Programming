package VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable{
    private String  policyNumber;

    public Truck(String vehicleNumber,  double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return super.getRentalRate()*days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.5+ 20; //more for truck
    }

    @Override
    public String getInsuranceDetails() {
        return "policy details is  " + maskPolicyNumber();
    }

    public String  maskPolicyNumber(){
        return (" is ******" + (policyNumber.length()-4)+ "********");
    }
}
