package depot;

import java.time.LocalDate;
import java.util.Objects;

public class Grocery {
    private final String name;
    private final String manufacturer;
    private final String type;
    private final LocalDate productionDate;
    private final LocalDate expirationDate;
    private final double volumePerKg;

    public Grocery(String name, String manufacturer, String type,
                   LocalDate productionDate, LocalDate expirationDate, double volumePerKg) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.type = type;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.volumePerKg = volumePerKg;
    }

    public double getVolumePerKg() {
        return volumePerKg;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grocery grocery = (Grocery) o;
        return Objects.equals(name, grocery.name) &&
                Objects.equals(manufacturer, grocery.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer);
    }
}
