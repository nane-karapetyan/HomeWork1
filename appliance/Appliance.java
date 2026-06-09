package appliance;

import java.util.ArrayList;
import java.util.List;

public class Appliance {
    private String type;
    private String brand;
    private double price;
    private List<Buyer> buyers;

    public Appliance(String type, String brand, double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.buyers = new ArrayList<>(); // Initialization
    }

    public void addBuyer(Buyer buyer) {
        this.buyers.add(buyer);
    }

    public void printDetails() {
        System.out.println("--- Appliance: " + type + " (" + brand + ") ---");
        System.out.println("Price: $" + price);
        System.out.println("Buyers Count: " + buyers.size());
        for (Buyer buyer : buyers) {
            System.out.println("  * " + buyer);
        }
        System.out.println();
    }
}
