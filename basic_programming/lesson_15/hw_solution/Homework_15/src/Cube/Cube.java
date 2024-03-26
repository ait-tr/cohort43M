package Cube;

public class Cube {
    private double length;
    public Cube(double length){
        this.length = length;
    }
    public double perimeter(){
        return 12 * length;
    }

    public double scope(){
        return length * length * length;
    }
    public double area(){
        return 6 * (length * length);
    }
    public void displayPerimeter(){
        System.out.println("P = " + 12 * length);
    }
    public void displayArea(){
        System.out.println("S = " + 6 * ( length * length));
    }
    public void displayScope(){
        System.out.println("V = " + (length * length * length));
    }
}
