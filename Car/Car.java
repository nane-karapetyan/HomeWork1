package Car;

public class Car {
    private String model;
    private int maxEngineOilKm;
    private int maxGearboxOilKm;
    private int currentEngineOilKm;
    private int currentGearboxOilKm;

    public Car(String aModel, int aMaxEngineOil, int aMaxGearboxOil) {
        model = aModel;
        maxEngineOilKm = aMaxEngineOil;
        maxGearboxOilKm = aMaxGearboxOil;
        currentEngineOilKm = 0;
        currentGearboxOilKm = 0;
    }

    public void drive() {
        int distance = (int) (Math.random() * 500) + 1;
        currentEngineOilKm = currentEngineOilKm + distance;
        currentGearboxOilKm = currentGearboxOilKm + distance;
    }

    public void changeEngineOil() {
        currentEngineOilKm = 0;
    }

    public void changeGearboxOil() {
        currentGearboxOilKm = 0;
    }

    public boolean isDriveable() {
        return currentEngineOilKm <= maxEngineOilKm && currentGearboxOilKm <= maxGearboxOilKm;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public int getCurrentEngineOilKm() {
        return currentEngineOilKm;
    }

    public int getCurrentGearboxOilKm() {
        return currentGearboxOilKm;
    }
}