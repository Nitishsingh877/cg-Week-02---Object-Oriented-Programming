package ECommercePlatform;

public class Clothing extends  Product implements Taxable{
    private double discount;
    private final  int tax = 18;

    public Clothing(String productName, String productID, double price, double discount) {
        super(productName, productID, price);
        this.discount = discount;
    }

    @Override
    public double calculateTax() {
        return (getPrice()*tax)/100;
    }

    @Override
    public String getTaxDetails() {
        return " @18% for clothing is "+ calculateTax();
    }

    @Override
    double calculateDiscount() {
        return getPrice()+calculateTax()-discount;
    }
}
