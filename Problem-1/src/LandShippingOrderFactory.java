public class LandShippingOrderFactory implements ShippingOrderFactory {
    @Override
    public ShippingOrder createShippingOrder(String orderID, double weight, String destination) {
        return new LandShippingOrder(orderID, weight, destination);
    }
}
