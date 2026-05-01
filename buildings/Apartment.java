package buildings;

public class Apartment extends ResidentialBuilding {
    private final int floor;

    public Apartment(int roomsCount, double buildingArea, int floorNumber) {
        super(roomsCount, buildingArea);
        if (floorNumber >= 1 && floorNumber <= 5) {
            floor = floorNumber;
        } else {
            floor = 1;
        }
    }
    public int getFloor() {
        return floor;
    }
}
