package Order;

public class Order {
    private static int totalOrders = 0;
    private static double shippingFee = 0.0;

    private int id;
    private String customerName;
    private double orderAmount;
    private String deliveryTime;

    public Order(String name, double amount, String time) {
        id = ++totalOrders;
        customerName = name;
        orderAmount = amount;
        deliveryTime = time;
    }

    public Order(String name, double amount) {
        id = ++totalOrders;
        customerName = name;
        orderAmount = amount;
        deliveryTime = "Standard Time";
    }

    public static void setShippingFee(double fee) {
        shippingFee = fee;
    }

    public double calculateTotal() {
        return orderAmount + shippingFee;
    }

    public static int getTotalOrders() {
        return totalOrders;
    }
}