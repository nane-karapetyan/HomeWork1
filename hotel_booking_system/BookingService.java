package hotel_booking_system;

public class BookingService {
    private Room[] hotelRooms;

    public BookingService(Room[] rooms) {
        this.hotelRooms = rooms;
    }
    public void bookRoom(Guest guest, Room room) throws BookingException {

        if (guest.getAge() < 18) {
            throw new UnderAgeException("Booking Denied: Guest " + guest.getName() + " is under 18.");
        }

        if (!room.isAvailable()) {
            Room suggestedRoom = findAlternativeRoom();

            if (suggestedRoom != null) {
                throw new RoomUnavailableException("Room " + room.getRoomNumber() +
                        " is occupied. We suggest Room " + suggestedRoom.getRoomNumber() + " instead.");
            } else {
                throw new RoomUnavailableException("Room " + room.getRoomNumber() +
                        " is occupied and no other rooms are available.");
            }
        }

        room.setAvailable(false);
        System.out.println("Booking confirmed for " + guest.getName() + " in Room " + room.getRoomNumber());
    }
    private Room findAlternativeRoom() {
        for (Room r : hotelRooms) {
            if (r.isAvailable()) {
                return r;
            }
        }
        return null;
    }
}
