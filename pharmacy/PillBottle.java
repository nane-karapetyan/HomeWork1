package pharmacy;

public class PillBottle<T extends Medication> {
    private T medicine;

    public void fill(T medicine) {
        this.medicine = medicine;
        System.out.println("Bottle filled with: " + medicine.getName());
    }

    public T extract() {
        return medicine;
    }
}
