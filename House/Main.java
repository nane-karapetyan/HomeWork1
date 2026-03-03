package House;

public class Main {
    public static void main(String[] args) {

        House house1 = new House(3, true, 2, 1, 95.5, "Bagramyan 1");
        House house2 = new House(house1);

        house2.setRoomsCount(4);
        house2.setLivingArea(110.0);

        System.out.println("House 1: Address: " + house1.getAddress() + ", Rooms: " + house1.getRoomsCount() + ", Area: " + house1.getLivingArea());
        System.out.println("House 2: Address: " + house2.getAddress() + ", Rooms: " + house2.getRoomsCount() + ", Area: " + house2.getLivingArea());

            }
}