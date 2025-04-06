package ECommercePlatform;

abstract class Product {
    private String productName;
    private String productID;
    private double price;

    public Product(String productName, String productID, double price) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


     //abstract method
    abstract  double calculateDiscount();

    //concrete method

    public void displayDetails(){
        System.out.println("product id is "+ getProductID());
        System.out.println("product name is "+ getProductName());
        System.out.println("product price is "+ getPrice());

    }



}
