package shape;

public class Triangle extends Shape {
    private int a, b, c;
    private final boolean isRight;

    public Triangle(String color, int a, int b, int c) {
        super("triangle", color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.isRight = checkRight();
    }

    private boolean checkRight() {
        int x = a * a, y = b * b, z = c * c;
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public boolean isRight() {
        return isRight;
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}