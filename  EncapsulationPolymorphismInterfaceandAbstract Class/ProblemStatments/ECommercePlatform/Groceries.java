package ECommercePlatform;

public class Groceries extends Product implements  Taxable{
    private double discount;
    private final int tax = 5;

    public Groceries(String productName, String productID, double price, double discount) {
        super(productName, productID, price);
        this.discount = discount;
    }

    @Override
    public double calculateTax() {
        return (getPrice()*tax)/100;
    }

    @Override
    public String getTaxDetails() {
        return " for groceries is @5% is "+ calculateTax();
    }

    @Override
    double calculateDiscount() {
        return getPrice()+ calculateTax() -discount;
    }
}
