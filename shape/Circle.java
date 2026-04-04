package shape;

public class Circle extends Shape {
    private int r;

    public Circle(String color, int r) {
        super("circle", color);
        this.r = r;
    }

    @Override
    public int getPerimeter() {
        return (int)(2 * Math.PI * r);
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}