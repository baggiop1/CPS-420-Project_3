public class AirShippingOrder extends ShippingOrder {
    private String airwayBillNumber; // Air identifier

    public AirShippingOrder(String orderID, double weight, String destination) {
        super(orderID, weight, destination);
        this.airwayBillNumber = "AIR" + orderID;
    }

    @Override
    public void prepareShipment() {
        System.out.println("Airway Bill:    " + airwayBillNumber);
        System.out.println("OrderID:        " + this.orderID);
        System.out.println("Weight:         " + this.weight);
        System.out.println("Destination:    " + this.destination);
    }

    @Override
    public double calculateCost() {
        return weight * 5.0;
    }

    @Override
    public void generateDocumentation() {
        System.out.println("\nGenerating air shipping documentation for: " + airwayBillNumber);
        prepareShipment();
        System.out.println("Shipping Cost:  $" + calculateCost() + "\n");
    }
}
