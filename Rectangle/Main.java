package Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0, 3.0);

        System.out.println("Default Area: " + r1.area());
        System.out.println("Custom Perimeter: " + r2.perimeter());
    }
}
