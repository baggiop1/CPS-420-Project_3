public class SeaShippingOrderFactory implements ShippingOrderFactory {
    @Override
    public ShippingOrder createShippingOrder(String orderID, double weight, String destination) {
        return new SeaShippingOrder(orderID, weight, destination);
    }
}
