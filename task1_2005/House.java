package task1_2005;

public class House implements Comparable<House> {
    private final double squareMeters;

    public House(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    @Override
    public int compareTo(House other) {
        return Double.compare(this.squareMeters, other.squareMeters);
    }

    @Override
    public String toString() {
        return "House{" + squareMeters + " sqm}";
    }
}
