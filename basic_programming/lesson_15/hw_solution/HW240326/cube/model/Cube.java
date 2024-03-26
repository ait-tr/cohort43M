package HW240326.cube.model;

public class Cube {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double perimeter(){
        return 12 * a;
    }

    public double area (){
        return a * a * 6;
    }

    public double volume (){
        return a * a * a;
    }
}
