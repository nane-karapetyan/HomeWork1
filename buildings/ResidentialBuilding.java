package buildings;

public abstract class ResidentialBuilding {
    private final double area;
    private final int originalRooms;
    private int currentRooms;

    private Double ceilingHeight;
    private Boolean hasBalcony;
    private boolean lightsOn = false;

    public ResidentialBuilding(int roomsCount, double buildingArea) {
        originalRooms = roomsCount;
        currentRooms = roomsCount;
        area = buildingArea;
    }
    public void changeRooms(int newCount) {
        if (Math.abs(newCount - originalRooms) <= 1) {
            currentRooms = newCount;
        }
    }
    public int getCurrentRooms() {
        return currentRooms;
    }
    public double getArea() {
        return area;
    }
    public void setCeilingHeight(double heightValue) {
        if (ceilingHeight == null) {
            ceilingHeight = heightValue;
        }
    }
    public void setHasBalcony(boolean balconyStatus) {
        if (hasBalcony == null) {
            hasBalcony = balconyStatus;
        }
    }
    public void switchLights(boolean status) {
        lightsOn = status;
    }
}