package hotel_booking_system;

public class Main {
    public static void main(String[] args) {

        Room[] rooms = {
                new Room(101, false),
                new Room(102, false),
                new Room(103, true)
        };

        BookingService service = new BookingService(rooms);
        Guest guest = new Guest("Alice", 20);

        try {

            service.bookRoom(guest, rooms[0]);
        } catch (BookingException e) {

            System.err.println("Error: " + e.getMessage());
        }
    }
}