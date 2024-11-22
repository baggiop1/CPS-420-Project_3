public class AirShippingOrderFactory implements ShippingOrderFactory {
    @Override
    public ShippingOrder createShippingOrder(String orderID, double weight, String destination) {
        return new AirShippingOrder(orderID, weight, destination);
    }
}
