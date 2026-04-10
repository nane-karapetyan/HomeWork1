package buildings;

public class PrivateHouse extends ResidentialBuilding {
    private boolean gatesOpen = false;

    public PrivateHouse(int roomsCount, double buildingArea) {
        super(roomsCount, buildingArea);
    }

    public void manageGates(boolean openStatus) {
        gatesOpen = openStatus;
    }

    public boolean isGatesOpen() {
        return gatesOpen;
    }
}