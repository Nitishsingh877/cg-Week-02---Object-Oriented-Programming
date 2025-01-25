package ECommercePlatform;

public class Electronics extends  Product implements  Taxable{
    private final double tax = 12;
    private double discount;

    public Electronics(String productName, String productID, double price,double discount) {
        super(productName, productID, price);
        this.discount =discount;
    }

    @Override
    public double calculateTax() {
        return (super.getPrice()*tax)/100;
    }

    @Override
    public String getTaxDetails() {
        return "@ 12% for electronics is "+ calculateTax();
    }

    @Override
    double calculateDiscount() {
        return super.getPrice()+calculateTax()-discount;
    }
}
