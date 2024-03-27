package Cube.model;

public class Cube {
private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }
    public double calculatePerimeter(){
        return 12*sideLength;
    }
    public double calculateVolume(){
        return sideLength*sideLength*sideLength;
    }
    public double calculateSurfaceArea(){
        return 6*sideLength*sideLength;
    }
}
