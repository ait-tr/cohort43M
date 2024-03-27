package Cube.model;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cube1= new Cube(4);
        Cube cube2= new Cube(1);
        Cube cube3= new Cube(7);


        System.out.println("Cube 1:");
        System.out.println("Perimeter: " + cube1.calculatePerimeter());
        System.out.println("Surface Area: " + cube1.calculateSurfaceArea());
        System.out.println("Volume: " + cube1.calculateVolume());

        System.out.println("Cube 2:");
        System.out.println("Perimeter: " + cube2.calculatePerimeter());
        System.out.println("Surface Area: " + cube2.calculateSurfaceArea());
        System.out.println("Volume: " + cube2.calculateVolume());

        System.out.println("Cube 3:");
        System.out.println("Perimeter: " + cube3.calculatePerimeter());
        System.out.println("Surface Area: " + cube3.calculateSurfaceArea());
        System.out.println("Volume: " + cube3.calculateVolume());
    }
}
