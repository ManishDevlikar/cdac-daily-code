package shapes;

public class Rectangle extends Shape {
    private final double length;
    private final double breadth;

    public Rectangle(double l, double b) {
        super();
        this.length = l;
        this.breadth = b;
    }

    
    @Override
    public double calArea() {
        return length * breadth;
    }

}