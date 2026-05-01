package House;

public class House {
    private int roomsCount;
    private boolean hasHallway;
    private int bathroomsCount;
    private int balconiesCount;
    private double livingArea;
    private String address;

    public House(int rCount, boolean hHallway, int bthCount, int blcCount, double lArea, String addr) {
        roomsCount = rCount;
        hasHallway = hHallway;
        bathroomsCount = bthCount;
        balconiesCount = blcCount;
        livingArea = lArea;
        address = addr;
    }

    public House(House other) {
        roomsCount = other.getRoomsCount();
        hasHallway = other.getHasHallway();
        bathroomsCount = other.getBathroomsCount();
        balconiesCount = other.getBalconiesCount();
        livingArea = other.getLivingArea();
        address = other.getAddress();
    }
    public int getRoomsCount() { return roomsCount; }
    public boolean getHasHallway() { return hasHallway; }
    public int getBathroomsCount() { return bathroomsCount; }
    public int getBalconiesCount() { return balconiesCount; }
    public double getLivingArea() { return livingArea; }
    public String getAddress() { return address; }

    public void setRoomsCount(int r) { roomsCount = r; }
    public void setBathroomsCount(int b) { bathroomsCount = b; }
    public void setBalconiesCount(int bc) { balconiesCount = bc; }
    public void setLivingArea(double a) { livingArea = a; }
}