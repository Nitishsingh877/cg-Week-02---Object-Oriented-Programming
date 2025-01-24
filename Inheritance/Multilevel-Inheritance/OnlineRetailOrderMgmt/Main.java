package OnlineRetailOrderMgmt;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("101", "grocery","12 jan");
        order.getOrderInfo();
        System.out.println();

        ShippedOrder shippedOrder = new ShippedOrder("102","oreo","12 jan",6532);
        shippedOrder.getOrderInfo();
        System.out.println();

        DeliveredOrder deliveredOrder  = new DeliveredOrder("102","oreo","12 jan",654823185,"20 ian");
        deliveredOrder.getOrderInfo();

    }
}
