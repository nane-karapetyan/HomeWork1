package depot;

public class Depot {
    private final double maxVolume;
    private double currentVolume;

    public Depot(double maxVolume) {
        if (maxVolume <= 0) {
            throw new IllegalArgumentException("Depot capacity must be a positive number.");
        }
        this.maxVolume = maxVolume;
        this.currentVolume = 0.0;
    }

    public void addGrocery(Grocery grocery, double weightKg) {
        if (weightKg <= 0) {
            throw new IllegalArgumentException("Weight must be a positive number.");
        }

        double requiredVolume = grocery.getVolumePerKg() * weightKg;

        if (currentVolume + requiredVolume > maxVolume) {
            throw new IllegalStateException("Not enough space in the depot to add this amount.");
        }

        currentVolume += requiredVolume;
        System.out.printf("Added %.2f kg of '%s' (%s). New volume: %.2f/%.2f%n",
                weightKg, grocery.getName(), grocery.getManufacturer(), currentVolume, maxVolume);
    }

    public void removeGrocery(Grocery grocery, double weightKg) {
        if (weightKg <= 0) {
            throw new IllegalArgumentException("Weight must be a positive number.");
        }

        double volumeToRemove = grocery.getVolumePerKg() * weightKg;

        if (currentVolume - volumeToRemove < 0) {
            throw new IllegalStateException("Cannot remove this amount. Depot volume cannot be negative.");
        }

        currentVolume -= volumeToRemove;
        System.out.printf("Removed %.2f kg of '%s' (%s). New volume: %.2f/%.2f%n",
                weightKg, grocery.getName(), grocery.getManufacturer(), currentVolume, maxVolume);
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }
}
