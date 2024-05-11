package Inheritans.ver2;

public class Circle extends Shape{
    private double radius;

    public Circle(String title, int id, double radius) {
        super(title, id);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcArea() {
        return 3.14 * (radius * radius);
    }

}
