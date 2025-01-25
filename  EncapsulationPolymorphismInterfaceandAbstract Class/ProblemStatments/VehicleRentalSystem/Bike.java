package VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable{
    private String  policyNumber;

    public Bike(String vehicleNumber,  double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return super.getRentalRate()*days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.05; //less for bike
    }

    @Override
    public String getInsuranceDetails() {
        return "policy details is  " + maskPolicyNumber();
    }

    public String  maskPolicyNumber(){
        return (" is ******" + (policyNumber.length()-4)+ "********");
    }
}
