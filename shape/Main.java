package shape;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List <Shape> shapes = new ArrayList<>();

        shapes.add(new Square("green", 5));
        shapes.add(new Rectangle("blue", 4, 6));
        shapes.add(new Triangle("red", 3, 4, 5));
        shapes.add(new Circle("yellow", 3));

        int maxPerimeter = -1;
        String maxShapeName = "";

        for (Shape s : shapes) {
            int p = s.getPerimeter();

            if (p > maxPerimeter) {
                maxPerimeter = p;
                maxShapeName = s.getName();
            }
        }

        System.out.println("Max perimeter: " + maxPerimeter);
        System.out.println("Shape: " + maxShapeName);
    }
}