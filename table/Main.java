package table;

public class Main {
    public static void main(String[] args) {
        SquareTable sTable = new SquareTable(4, "Wood", "Oak", 2.0);
        System.out.println("Square area: " + sTable.calculateArea());

        CircleTable cTable = new CircleTable(1, "Metal", "Glass", 1.5);
        System.out.println("Circle area: " + cTable.calculateArea());

        ExpandableRectangleTable eTable = new ExpandableRectangleTable(4, "Metal", "Marble", 3.0, 2.0, 1.5);

        System.out.println("Normal Rectangle area: " + eTable.calculateArea());
        System.out.println("Expanded area: " + eTable.getExpandedArea());

        sTable = null;

        System.out.println("The square table reference is now null.");
    }
}