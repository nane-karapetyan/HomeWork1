package task2_2605;
import java.util.Objects;

public class City implements Comparable<City> {
    private String country;
    private String region;
    private String name;

    public City(String country, String region, String name) {
        this.country = country;
        this.region = region;
        this.name = name;
    }

    public String getCountry() { return country; }
    public String getRegion() { return region; }
    public String getName() { return name; }

    @Override
    public int compareTo(City other) {
        if (other == null) return 1;

        int countryCompare = this.country.compareTo(other.country);
        if (countryCompare != 0) {
            return countryCompare;
        }

        int regionCompare = this.region.compareTo(other.region);
        if (regionCompare != 0) {
            return regionCompare;
        }

        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(country, city.country) &&
                Objects.equals(region, city.region) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, region, name);
    }

    @Override
    public String toString() {
        return "City{Country='" + country + "', Region='" + region + "', Name='" + name + "'}";
    }
}
