import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        CartItem apple = new CartItem();
        apple.addItem();
        apple.Delete();
        apple.displayDetails();

    }
}

class CartItem {
    private String itemName;
    private int price;
    private int quantity;

    public void addItem () {
        Scanner sc = new Scanner(System.in);
        System.out.println("what item is ?");
        itemName = sc.nextLine();
        System.out.println("what price you are selling?");
        price = sc.nextInt();
        System.out.println("what is the quantity?");
        quantity = sc.nextInt();
    }
    public void Delete() {
        if(quantity == 0){
            System.out.println("no items found");
        }else {
            quantity--;
            System.out.println("items deleted successfully");
        }
    }
    public void displayDetails() {
        System.out.println("items name is" + itemName);
        System.out.println("items price is " + price);
        System.out.println("item quantity is "+ quantity);
        System.out.println("total price is " + (quantity*price));
    }
}
