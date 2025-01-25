package OnlineFoodDeliverySystem;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<FoodItem> foodItemArrayList = new ArrayList<>();

        VegItem panner = new VegItem("panner",360,5);
        VegItem mashroom = new VegItem("mashrrom",300,5);

        NonVegItem chicken = new NonVegItem("chicken",240,3,10);
        NonVegItem khasi = new NonVegItem("khasi", 660,2,20);

        foodItemArrayList.add(panner);
        foodItemArrayList.add(mashroom);
        foodItemArrayList.add(chicken);
        foodItemArrayList.add(khasi);

        double totalOrderPrice = 0.0;
        for (FoodItem item: foodItemArrayList
             ) {
            item.getItemDetails();
            System.out.println("total price is "+ item.calculateTotalPrice());
            System.out.println("discount for the item is " + ((Discountable) item).getDiscountDetails());
            System.out.println("price after discount is " + ((Discountable) item).applyDiscount(5));
            double totalPrice = item.calculateTotalPrice();
            totalOrderPrice  += totalPrice;
            System.out.println();
            System.out.println("total price for the order is " + totalOrderPrice);
            System.out.println("--------------------------------");

        }


    }
}
