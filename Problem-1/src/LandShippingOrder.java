public class LandShippingOrder extends ShippingOrder {
    private String deliveryTruckID; // Land identifier

    public LandShippingOrder(String orderID, double weight, String destination) {
        super(orderID, weight, destination);
        this.deliveryTruckID = "LAND" + orderID;
    }

    @Override
    public void prepareShipment() {
        System.out.println("Truck ID:       " + deliveryTruckID);
        System.out.println("OrderID:        " + this.orderID);
        System.out.println("Weight:         " + this.weight);
        System.out.println("Destination:    " + this.destination);
    }

    @Override
    public double calculateCost() {
        return weight * 2.9;
    }

    @Override
    public void generateDocumentation() {
        System.out.println("\nGenerating land shipping documentation for: " + deliveryTruckID);
        prepareShipment();
        System.out.println("Shipping Cost:  $" + calculateCost() + "\n");
    }
}
