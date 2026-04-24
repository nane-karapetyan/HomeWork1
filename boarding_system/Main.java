package boarding_system;


public class Main {
    public static void main(String[] args) {
        BoardingService service = new BoardingService();
        Passenger passenger = new Passenger("Aram", false, false, false);

        try {
            service.boardPassenger(passenger);
        } catch (BoardingException e) {

            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}
