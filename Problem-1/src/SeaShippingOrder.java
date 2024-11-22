public class SeaShippingOrder extends ShippingOrder {
    private String billOfLading; // Sea identifier

    public SeaShippingOrder(String orderID, double weight, String destination) {
        super(orderID, weight, destination);
        this.billOfLading = "SEA" + orderID;
    }

    @Override
    public void prepareShipment() {
        System.out.println("Bill of Lading:    " + billOfLading);
        System.out.println("OrderID:           " + this.orderID);
        System.out.println("Weight:            " + this.weight);
        System.out.println("Destination:       " + this.destination);
    }

    @Override
    public double calculateCost() {
        return weight * 3.7;
    }

    @Override
    public void generateDocumentation() {
        System.out.println("\nGenerating sea shipping documentation for: " + billOfLading);
        prepareShipment();
        System.out.println("Shipping Cost:     $" + calculateCost() + "\n");
    }
}
