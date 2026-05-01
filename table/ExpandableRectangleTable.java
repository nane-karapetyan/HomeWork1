package table;

public class ExpandableRectangleTable extends RectangleTable {
    private double extraArea;
    public ExpandableRectangleTable(int lCount, String lMaterial, String tMaterial,
                                    double l, double w, double extra) {
        super(lCount, lMaterial, tMaterial, l, w);
        extraArea = extra;
    }

    public double getExtraArea() {
        return extraArea;
    }

    public double getExpandedArea() {
        return calculateArea() + extraArea;
    }
}