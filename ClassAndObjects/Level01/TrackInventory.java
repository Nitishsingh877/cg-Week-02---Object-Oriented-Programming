import java.util.Scanner;

public class TrackInventory {
    public static void main(String[] args) {
        Item item1 = new Item(101,"surf",99.00);
        item1.displayItems();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the quantity");
        int quantity = input.nextInt();
        System.out.println("total cost is "+ item1.getTotalPrice(quantity));


    }
}

class Item{
//attributes
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode,String itemName,double price){
        this.itemCode = itemCode;
        this.itemName =itemName;
        this.price = price;

    }
    public void displayItems () {
        System.out.println("the itemCode is "+ itemCode + " and itemName is "+ itemName + " for price "+ price);
    }
    public double getTotalPrice(int quantity) {
        return price*quantity;
    }
}
