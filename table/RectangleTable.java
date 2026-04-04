package table;

public class RectangleTable extends Table {
    private double length;
    private double width;

    public RectangleTable(int lCount, String lMaterial, String tMaterial, double l, double w) {
        super(lCount, lMaterial, tMaterial);
        length = l;
        width = w;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}