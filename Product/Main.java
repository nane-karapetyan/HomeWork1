package Product;

public class Main {
    public static void main(String[] args) {
        Product.setDiscountRate(10.0);

        Product p1 = new Product("Laptop", 1200.0, 2);

        Product p2 = new Product("Smartphone", 800.0, 10, 5.0);

        System.out.println("Laptop Final Price: " + p1.calculateFinalPrice());
        System.out.println("Smartphone Final Price: " + p2.calculateFinalPrice());
    }
}

