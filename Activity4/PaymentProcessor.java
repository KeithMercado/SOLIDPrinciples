public class PaymentProcessor {
    public void processPayment(Order order) {
        order.getPaymentMethod().pay(order.getAmount());
    }
}