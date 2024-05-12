package hwlesson21.Inheritiance.task2;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        System.out.println("Area of circle with radius " + radius + " is: ");
        return  Math.PI * radius *radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "}";
    }
}
