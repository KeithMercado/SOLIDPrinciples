public class Customer {
    private String name;
    private DiscountStrategy discountStrategy;

    public Customer(String name, DiscountStrategy discountStrategy) {
        this.name = name;
        this.discountStrategy = discountStrategy;
    }

    public double applyDiscount(double amount) {
        return amount - discountStrategy.calculateDiscount(amount);
    }
}