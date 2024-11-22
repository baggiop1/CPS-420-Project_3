public interface ShippingOrderFactory {
    ShippingOrder createShippingOrder(String orderID, double weight, String destination);
}
