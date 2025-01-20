public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product nirma = new Product("nirma",899,5,101);
        Product wheel = new Product("wheel",100,5,101);

        Product.setDiscount(20);

        nirma.DisplayDetails();
        nirma.getTotalPrice();

        wheel.DisplayDetails();
        wheel.getTotalPrice();

    }
}

class Product {
    private static double discount;
    private String productName;
    private double price;
    private int quantity;
    private  final int productID;

    //constrctor
    Product(String productName, double price,int quantity,int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity =quantity;
        this.productID = productID;
    }
    public static void setDiscount(int newDiscount) {
        discount = newDiscount;
    }

    public void DisplayDetails() {
        System.out.println("product name is "+ productName);
        System.out.println("price is "+ price);
        System.out.println("quantity is "+ quantity);
        System.out.println("discount is "+ discount);
    }

    private double totalPrice = price*quantity;

    public void getTotalPrice() {
        System.out.println("total price after discount is " + (totalPrice-price)/100);
    }
}
