package table;

public abstract class Table {
    private int legsCount;
    private String legsMaterial;
    private String topMaterial;

    public Table(int lCount, String lMaterial, String tMaterial) {
        legsCount = lCount;
        legsMaterial = lMaterial;
        topMaterial = tMaterial;
    }

    public abstract double calculateArea();

    public int getLegsCount() {
        return legsCount;
    }

    public String getLegsMaterial() {
        return legsMaterial;
    }

    public String getTopMaterial() {
        return topMaterial;
    }
}