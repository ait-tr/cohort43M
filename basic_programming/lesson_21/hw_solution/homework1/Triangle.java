package homework.homework1;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p-side2) * (p - side3));
    }

    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    void printInfo() {
        System.out.println("Triangle:");
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());

    }
}
