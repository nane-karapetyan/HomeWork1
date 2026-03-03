package Car;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 5000, 10000);

        myCar.drive();
        myCar.drive();

        System.out.println("Model: " + myCar.getModel());
        System.out.println("Current Engine Oil KM: " + myCar.getCurrentEngineOilKm());
        System.out.println("Current Gearbox Oil KM: " + myCar.getCurrentGearboxOilKm());
        System.out.println("Is Driveable: " + myCar.isDriveable());

        myCar.changeEngineOil();
        System.out.println("After Engine Oil Change, KM: " + myCar.getCurrentEngineOilKm());
        System.out.println("Is Driveable now: " + myCar.isDriveable());
    }
}