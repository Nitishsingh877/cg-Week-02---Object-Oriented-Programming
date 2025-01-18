public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("wheel surf");
        Product p2 = new Product("rin surf");
        Product p3 = new Product("surf excel");

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        Product.displayTotalProducts(); //accesing class methods.

    }
}

class Product {
    //productname price is instance variable
    String productName;
    double price;
    //class variable
    static int totalProducts;

    //constructor
    Product(String productName) {
        this.productName = productName;
        totalProducts++; //increment total product
    }
    //instance methods
    void  displayProduct() {
        System.out.println("product name is " + productName);
    }


    //class method
    static  void displayTotalProducts() {
        System.out.println("total products is " + totalProducts);
    }



    //
}