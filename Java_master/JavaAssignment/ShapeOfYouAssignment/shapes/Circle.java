package shapes;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    @Override
    public double calArea() {
        return 3.14 * radius * radius;
    }
}