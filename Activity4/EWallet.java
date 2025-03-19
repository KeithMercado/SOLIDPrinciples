public class EWallet implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("You are paying in GCash");
    }
}