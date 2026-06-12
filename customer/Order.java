package customer;

public class Order {
    private final String orderId;
    private final String productName;
    private final Customer customer;

    public Order(String orderId, String productName, Customer customer) {
        this.orderId = orderId;
        this.productName = productName;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
