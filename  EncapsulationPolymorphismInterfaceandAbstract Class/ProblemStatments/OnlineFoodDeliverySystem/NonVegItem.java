package OnlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements  Discountable{
    private int additionalCharges;

    public NonVegItem(String itemName, double price, int quantity, int additionalCharges) {
        super(itemName, price, quantity);
        this.additionalCharges = additionalCharges;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice()+additionalCharges)*getQuantity();
    }

    @Override
    public String getDiscountDetails() {
        return "5%";
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        return calculateTotalPrice() - (calculateTotalPrice()*discountPercentage)/100;
    }
}
