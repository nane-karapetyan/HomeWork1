package bankingSystem;

public class InsufficientFundsException extends Exception {
    private double shortfall;

    public InsufficientFundsException(double shortfall) {
        super("Shortfall: " + shortfall);
        this.shortfall = shortfall;
    }
    public double getShortfall() {
        return shortfall;
    }
}