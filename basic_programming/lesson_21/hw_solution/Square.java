package homework_shape;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square: with side = " + side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimetr() {
        return 4 * side;
    }
}
