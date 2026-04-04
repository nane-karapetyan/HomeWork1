package shape;
abstract class Shape {
    private final String name;
    private final String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPerimeter() {
        System.out.println("Perimeter not implemented for this shape");
        return -1;
    }

    public double getArea() {
        System.out.println("Area not implemented for this shape");
        return -1.0;
    }
}