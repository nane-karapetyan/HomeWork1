package table;

public class CircleTable extends Table {
    private double radius;

    public CircleTable(int lCount, String lMaterial, String tMaterial, double r) {
        super(lCount, lMaterial, tMaterial);
        radius = r;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}