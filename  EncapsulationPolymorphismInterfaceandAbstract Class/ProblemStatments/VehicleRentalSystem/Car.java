package VehicleRentalSystem;

public class Car extends Vehicle implements Insurable{

    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "car", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return super.getRentalRate()*days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.1; //insurance 10%
    }

    @Override
    public String getInsuranceDetails() {
        return "policy number : " + maskPolicyNumber();
    }

    public String  maskPolicyNumber(){
       return (" is ******" + (policyNumber.length()-4)+ "********");
    }
}
