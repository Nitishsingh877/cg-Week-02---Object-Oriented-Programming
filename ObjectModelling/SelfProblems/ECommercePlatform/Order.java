package ECommercePlatform;

import java.util.ArrayList;

 class Order {
     private static int order = 1;
    private String orderName;
    private String orderID;
    private ArrayList<Product> productArrayList;

    public Order(String orderID,String orderName){
        this.orderID = orderID;
        this.orderName = orderName;
        order++;
        productArrayList = new ArrayList<>();
    }

    public void getOrderData(){
        System.out.println("order name is "+ orderName);
        System.out.println("order id is "+ orderID);
        System.out.println("total number of orders are "+ order);
    }

    public void addProduct(Product p){
        productArrayList.add(p);
    }

    public void displayOrderDetails(){
        System.out.println("order id is "+ orderID);
        for (Product p:productArrayList
             ) {
              p.displayProduct();
            System.out.println();
        }
        System.out.println();
    }
}
