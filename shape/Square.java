package shape;
public class Square extends Shape {
    private int a;

    public Square(String color, int a) {
        super("square", color);
        this.a = a;
    }

    @Override
    public int getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}