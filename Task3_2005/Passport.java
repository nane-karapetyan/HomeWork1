package Task3_2005;

public class Passport implements Identifiable<String> {
    private final String passportNumber;
    private final String ownerName;

    public Passport(String passportNumber, String ownerName) {
        this.passportNumber = passportNumber;
        this.ownerName = ownerName;
    }

    @Override
    public String getId() {
        return passportNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
}