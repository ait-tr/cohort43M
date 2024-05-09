package homework.homework1;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    void printInfo() {
        System.out.println("Rectangle: ");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " +getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
