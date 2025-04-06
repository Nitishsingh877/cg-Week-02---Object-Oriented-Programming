package ECommercePlatform;

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        Customer nitish = new Customer("nitish");


        Product oreo = new Product("oreo",10,5);
        Product milk = new Product("milk",15,5);
        Product bisk = new Product("biskut",20,3);

        Order o1 = new Order("101","oreo");
        Order o2 = new Order("102","bisk");

        o1.addProduct(oreo);
        o2.addProduct(milk);
        o1.addProduct(bisk);
        o2.addProduct(oreo);

        nitish.addOrder(o1);

        nitish.getOrderDetails();



    }
}
