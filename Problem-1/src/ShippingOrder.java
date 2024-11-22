public abstract class ShippingOrder {
    protected String orderID; // Unique identifier for the order
    protected double weight; // Weight of the shipment
    protected String destination; // Destination address

    // ShippingOrder object constructor
    public ShippingOrder(String orderID, double weight, String destination) {
        this.orderID = orderID;
        this.weight = weight;
        this.destination = destination;
    }

    // Abstract methods
    public abstract void prepareShipment();

    public abstract double calculateCost();

    public abstract void generateDocumentation();
}