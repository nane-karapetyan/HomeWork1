package Rectangle;

public class Rectangle {
    double length;
    double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
}
