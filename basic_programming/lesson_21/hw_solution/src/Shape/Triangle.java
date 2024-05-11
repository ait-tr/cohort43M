package Shape;

public class Triangle extends Shape{
    private double height;
    private double sizeA;
    private double sizeB;
    private double sizeC;

    public Triangle(String title, double height, double sizeA, double sizeB, double sizeC) {
        super(title);
        this.height = height;
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    public double getHeight() {
        return height;
    }

    public double getSizeA() {
        return sizeA;
    }

    public double getSizeB() {
        return sizeB;
    }

    public double getSizeC() {
        return sizeC;
    }


    @Override
    public double getArea() {
        return 0.5 * height * sizeA;
    }

    @Override
    public double getPerimeter() {
        return sizeA + sizeB + sizeC;
    }

}
