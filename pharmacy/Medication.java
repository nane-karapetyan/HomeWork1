package pharmacy;

abstract class Medication {
    abstract String getName();
}
class Aspirin extends Medication {
    @Override
    String getName() { return "Aspirin"; }
}
class VitaminC extends Medication {
    @Override
    String getName() { return "Vitamin C"; }
}