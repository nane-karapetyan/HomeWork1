package Order;

public class Main {
    public static void main(String[] args) {
        Order.setShippingFee(500.0);

        Order o1 = new Order("Davit", 2000.0);
        Order o2 = new Order("Alisa", 3500.0, "10:00 AM");

        System.out.println("Total for John: " + o1.calculateTotal());
        System.out.println("Total for Alice: " + o2.calculateTotal());
        System.out.println("Total orders count: " + Order.getTotalOrders());
    }
}
