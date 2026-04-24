package hotel_booking_system;

class BookingException extends Exception {
    public BookingException(String message) {
        super(message);
    }
}
class RoomUnavailableException extends BookingException {
    public RoomUnavailableException(String message) {
        super(message);
    }
}
class UnderAgeException extends BookingException {
    public UnderAgeException(String message) {
        super(message);
    }
}