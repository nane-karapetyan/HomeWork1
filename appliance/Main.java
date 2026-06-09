package appliance;

public class Main {
    public static void main(String[] args) {
        Appliance tv = new Appliance("TV", "Samsung", 799.99);
        Appliance vacuum = new Appliance("Vacuum Cleaner", "Dyson", 449.99);

        Buyer buyer1 = new Buyer("Aram", "2026-06-08", "address1");
        Buyer buyer2 = new Buyer("Alice", "2026-06-09", "address2");
        Buyer buyer3 = new Buyer("Hayk", "2026-06-09", "address3");

        tv.addBuyer(buyer1);
        tv.addBuyer(buyer2);
        vacuum.addBuyer(buyer3);

        tv.printDetails();
        vacuum.printDetails();
    }
}