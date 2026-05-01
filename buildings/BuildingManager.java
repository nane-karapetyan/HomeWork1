package buildings;

import java.util.ArrayList;
import java.util.List;

public class BuildingManager {
    public static void turnOffAllLights(List<ResidentialBuilding> buildings) {
        System.out.println("--- System: Turning off all lights ---");
        for (ResidentialBuilding building : buildings) {
            building.switchLights(false);
            System.out.println("Lights turned off for a building with area: " + building.getArea());
        }
    }
    public static void main(String[] args) {
        List<ResidentialBuilding> allBuildings = new ArrayList<>();

        Apartment myApartment = new Apartment(3, 75.5, 4);
        PrivateHouse myHouse = new PrivateHouse(5, 180.0);

        myApartment.setHasBalcony(true);
        myHouse.setCeilingHeight(3.5);

        System.out.println("Testing room changes for Apartment (Original: 3):");

        myApartment.changeRooms(2);
        System.out.println("Rooms after changing to 2: " + myApartment.getCurrentRooms());

        myApartment.changeRooms(1);
        System.out.println("Rooms after invalid change to 1 (should stay 2): " + myApartment.getCurrentRooms());

        myApartment.changeRooms(3);
        System.out.println("Rooms after changing back to 3: " + myApartment.getCurrentRooms());

        allBuildings.add(myApartment);
        allBuildings.add(myHouse);

        System.out.println();
        turnOffAllLights(allBuildings);
    }
}