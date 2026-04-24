package boarding_system;

class BoardingException extends Exception {
    public BoardingException(String message) {
        super(message);
    }
}
class ExpiredPassportException extends BoardingException {
    public ExpiredPassportException(String message) {
        super(message);
    }
}
class NoVisaException extends BoardingException {
    public NoVisaException(String message) {
        super(message);
    }
}
class InvalidBoardingPassException extends BoardingException {
    public InvalidBoardingPassException(String message) {
        super(message);
    }
}
