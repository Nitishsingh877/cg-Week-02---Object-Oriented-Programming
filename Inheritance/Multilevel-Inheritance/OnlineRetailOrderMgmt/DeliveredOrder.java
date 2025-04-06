package OnlineRetailOrderMgmt;

public class DeliveredOrder extends  ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(String orderID, String orderName, String orderDate, double trackingNumber, String deliveryDate) {
        super(orderID, orderName, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "order delivered";
    }

    @Override
    public void getOrderInfo() {
        super.getOrderInfo();
        System.out.println("delivery date is "+ deliveryDate);
    }
}
