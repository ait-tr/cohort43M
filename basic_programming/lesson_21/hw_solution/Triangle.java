package homework_shape;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC, double pp) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;

    }

    @Override
    public String toString() {
        return "Triangle: with sideA = " + sideA + " sideB = " + sideB + " sideC = " + sideC;
    }

    @Override
    public double calculateArea() {
        double pp = (sideA+sideB+sideC)/2;
        return (pp * (pp-sideA) * (pp-sideB) * (pp-sideC));
    }

    @Override
    public double calculatePerimetr() {
        return sideA+sideB+sideC;
    }
}

