package homework_shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle: with radius = " + radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimetr() {
        return 2 * Math.PI * radius;
    }
}
