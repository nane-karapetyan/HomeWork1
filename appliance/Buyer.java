package appliance;
import java.util.ArrayList;
import java.util.List;

class Buyer {
    private String fullName;
    private String purchaseDate;
    private String address;

    public Buyer(String fullName, String purchaseDate, String address) {
        this.fullName = fullName;
        this.purchaseDate = purchaseDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Buyer: %s, Date: %s, Address: %s",
                fullName, purchaseDate, address);
    }
}
