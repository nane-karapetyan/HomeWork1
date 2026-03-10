package Product;

public class Product {
    private static double discountRate = 0.0;
    private static int idCounter = 0;

    private int id;
    private String name;
    private double price;
    private int quantity;
    private double additionalDiscount;

    public Product(String n, double p, int q) {
        id = ++idCounter;
        name = n;
        price = p;
        quantity = q;
        additionalDiscount = 0.0;
    }

    public Product(String n, double p, int q, double ad) {
        id = ++idCounter;
        name = n;
        price = p;
        quantity = q;
        additionalDiscount = ad;
    }

    public static void setDiscountRate(double rate) {
        discountRate = rate;
    }

    public double calculateFinalPrice() {
        double totalDiscount = discountRate + additionalDiscount;
        return price * (1 - totalDiscount / 100);
    }
}
