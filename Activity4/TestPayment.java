public class TestPayment {
    public static void main(String[] args) {
        Order order1 = new Order(100.0, new EWallet());
        Order order2 = new Order(200.0, new Cash());
        Order order3 = new Order(500.0, new CreditCard());

        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(order1);
        processor.processPayment(order2);
        processor.processPayment(order3);
    }
}