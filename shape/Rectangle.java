package shape;

public class Rectangle extends Shape {
    private int a, b;

    public Rectangle(String color, int a, int b) {
        super("rectangle", color);
        this.a = a;
        this.b = b;
    }

    @Override
    public int getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return a * b;
    }
}