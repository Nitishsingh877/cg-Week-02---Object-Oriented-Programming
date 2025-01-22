package ECommercePlatform;

public class Product {

    private String productName;
    private int price;
    private int quantity;

    public Product(String productName,int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct(){
        System.out.println("product name is "+ productName);
        System.out.println("product price is "+ price);
        System.out.println("product quantity is "+ quantity);
        System.out.println("total price is "+ setTotal_price());
    }
    private int total_price = 0;
    public int setTotal_price(){
        return price*quantity;
    }
}
