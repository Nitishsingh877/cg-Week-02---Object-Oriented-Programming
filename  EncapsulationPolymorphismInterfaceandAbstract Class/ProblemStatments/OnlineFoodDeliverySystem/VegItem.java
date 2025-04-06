package OnlineFoodDeliverySystem;

public class VegItem extends  FoodItem implements Discountable{
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice()*getQuantity();
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
