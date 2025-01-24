package OnlineRetailOrderMgmt;

public class ShippedOrder extends Order{
    private double trackingNumber;

    public ShippedOrder(String orderID, String orderName, String orderDate, double trackingNumber) {
        super(orderID, orderName, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "order shipped!!";
    }

    @Override
    public void getOrderInfo() {
        super.getOrderInfo();
        System.out.println("tracking number is "+ trackingNumber);
    }
}
