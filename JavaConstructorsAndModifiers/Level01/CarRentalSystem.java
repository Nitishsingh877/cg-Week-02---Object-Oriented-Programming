import java.lang.invoke.StringConcatException;
import java.util.concurrent.Callable;

public class CarRentalSystem {
    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        System.out.println("default const");
        c1.calculateTotalCost();
        c1.displayResults();

        CarRental c2 = new CarRental("nitish singh","BMW",10);
        System.out.println("\nparametrised const");
        c2.calculateTotalCost();
        c2.displayResults();
        }

    }


class CarRental {
    //attributes
    private  String customerName;
    private String carModel;
    private int rentalDays;
    private  static  final double Daily_Rate = 50.0;

//    default const
// Default constructor
public CarRental() {
    this("Unknown Customer", "Standard Model", 1); // Default values
}
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return  Daily_Rate*rentalDays;
    }

    void displayResults() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
