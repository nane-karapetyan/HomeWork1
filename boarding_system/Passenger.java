package boarding_system;

public class Passenger {
    private String name;
    private boolean isPassportValid;
    private boolean hasVisa;
    private boolean isBoardingPassValid;

    public Passenger(String name, boolean isPassportValid, boolean hasVisa, boolean isBoardingPassValid) {
        this.name = name;
        this.isPassportValid = isPassportValid;
        this.hasVisa = hasVisa;
        this.isBoardingPassValid = isBoardingPassValid;
    }
    public boolean isPassportValid() { return isPassportValid; }
    public boolean hasVisa() { return hasVisa; }
    public boolean isBoardingPassValid() { return isBoardingPassValid; }
    public String getName() { return name; }
}