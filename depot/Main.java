package depot;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Depot depot = new Depot(500.0);

        Grocery milk = new Grocery("Milk 3.2%", "Ashtarak Kat", "Dairy",
                LocalDate.now(), LocalDate.now().plusDays(5), 0.05);

        Grocery bread = new Grocery("Grand Bread", "Sevan Bakery", "Bakery",
                LocalDate.now(), LocalDate.now().plusDays(3), 0.08);

        System.out.println("--- Operations Started ---");

        depot.addGrocery(milk, 2000);
        depot.addGrocery(bread, 3000);
        depot.removeGrocery(bread, 1000);

        try {
            depot.addGrocery(milk, 6000);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}