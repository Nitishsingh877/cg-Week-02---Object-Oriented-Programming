package OnlineFoodDeliverySystem;

public interface Discountable {
    String getDiscountDetails();

    double applyDiscount(double discountPercentage);

}
