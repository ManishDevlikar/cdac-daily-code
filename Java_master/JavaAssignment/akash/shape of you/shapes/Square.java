package shapes;

public class Square extends Shape {
    private final double side;

    public Square(double side){
        super();
        this.side = side;
    }

    @Override
    public double calArea(){
        return side * side;
    }
}
