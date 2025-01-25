package OnlineFoodDeliverySystem;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //abstract method
    public  abstract double calculateTotalPrice();

    //concrete method
    public void getItemDetails(){
        System.out.println("item name is "+ getItemName());
        System.out.println("price for item is "+ getPrice());
        System.out.println("quantity needed is " +getQuantity());
    }
}
