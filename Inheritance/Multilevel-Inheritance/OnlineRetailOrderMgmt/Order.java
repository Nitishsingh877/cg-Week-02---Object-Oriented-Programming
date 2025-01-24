package OnlineRetailOrderMgmt;

public class Order {
    private String orderID;
   private String orderName;
    private String orderDate;

    public Order(String orderID,String orderName, String orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderName = orderName;
    }
    public  String getOrderStatus(){
        return "order placed!!!";
    }

     public void getOrderInfo(){
         System.out.println("order name is "+ orderName);
         System.out.println("order id is " + orderID);
         System.out.println("status" + getOrderStatus());

     }
}
