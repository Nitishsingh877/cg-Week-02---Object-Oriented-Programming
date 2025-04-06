package ECommercePlatform;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Electronics electronics = new Electronics("cable","101",1500,100);
        Clothing clothing =new Clothing("shirt","102",2500,500);
        Groceries groceries = new Groceries("hari sbji","103",100,0);

        products.add(electronics);
        products.add(clothing);
        products.add(groceries);

        for (Product p:products
             ) {
            p.displayDetails();
            System.out.println("the tax on each item is "+ ((Taxable) p).getTaxDetails());
            System.out.println("final price after adding tax and subtracting discount is "+ p.calculateDiscount());
            System.out.println("-----------------------------");
        }
    }
}
