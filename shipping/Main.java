package shipping;

public class Main {
    public static void main(String[] args) {

        Crate<Car> carCrate = new Crate<>();
        carCrate.pack(new Car("Tesla Model S"));
        Car myCar = carCrate.unpack();

        Crate<Fruit> fruitCrate = new Crate<>();
        fruitCrate.pack(new Fruit("Apple", "Red"));
        Fruit myFruit = fruitCrate.unpack();

        Crate<String> messageCrate = new Crate<>();
        messageCrate.pack("Important Documents");
        String secret = messageCrate.unpack();
    }
}
class Car {
    String model;
    Car(String model) { this.model = model; }
    @Override public String toString() { return "Car: " + model; }
}

class Fruit {
    String name, color;
    Fruit(String name, String color) { this.name = name; this.color = color; }
    @Override public String toString() { return name + " (" + color + ")"; }
}