package ECommercePlatform;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Order> orderArrayList;

    public Customer(String customerName){
        this.customerName =customerName;
        orderArrayList = new ArrayList<>();
    }

    public void addOrder(Order o){
        orderArrayList.add(o);
    }
    public void dispCustomerData(){
        System.out.println("customer name is "+ customerName);
    }

    public void getOrderDetails(){
        System.out.println("customer name is "+ customerName);
        System.out.println("order Placed successfully");
        for (Order o:orderArrayList
             ) {
            o.displayOrderDetails();
            System.out.println();
        }
        System.out.println();
    }
}
