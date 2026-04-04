package table;

public class SquareTable extends Table {
    private double side;

    public SquareTable(int lCount, String lMaterial, String tMaterial, double s) {
        super(lCount, lMaterial, tMaterial);
        side = s;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
}