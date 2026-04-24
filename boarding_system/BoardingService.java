package boarding_system;

public class BoardingService {
    public void boardPassenger(Passenger p) throws BoardingException {

        if (!p.isPassportValid()) {
            throw new ExpiredPassportException("CRITICAL ERROR: Passport for passenger " + p.getName() + " is expired.");
        }
        if (!p.hasVisa()) {
            throw new NoVisaException("ERROR: Passenger " + p.getName() + " does not have a valid visa.");
        }
        if (!p.isBoardingPassValid()) {
            throw new InvalidBoardingPassException("ERROR: Boarding pass for passenger " + p.getName() + " is invalid.");
        }
        System.out.println("Success! Passenger " + p.getName() + " has been boarded.");
    }
}