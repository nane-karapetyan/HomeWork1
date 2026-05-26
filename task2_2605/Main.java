package task2_2605;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<City> cities = new ArrayList<>();
        cities.add(new City("Armenia", "Syunik", "Goris"));
        cities.add(new City("Armenia", "Ararat", "Artashat"));
        cities.add(new City("France", "Jan", "Paris"));
        cities.add(new City("Armenia", "Syunik", "Kapan"));

        System.out.println("Before Sort ");
        for (City city : cities) {
            System.out.println(city);
        }

        Collections.sort(cities);

        System.out.println("After Sort ");
        for (City city : cities) {
            System.out.println(city);
        }

        City searchCity1 = new City("Armenia", "Syunik", "Goris");
        City searchCity2 = new City("USA", "California", "Los Angeles");

        System.out.println(" Search Results ");
        System.out.println("Contains Goris: " + cities.contains(searchCity1));
        System.out.println("Contains Los Angeles: " + cities.contains(searchCity2));
    }
}