public class PaymentSystem {
    public boolean processPayment(String paymentDetails) {
      
        System.out.println("Payment processed: " + paymentDetails);
        return true;
    }

    public void refundPayment(String transactionID) {
       
        System.out.println("Payment refunded: " + transactionID);
    }
}
