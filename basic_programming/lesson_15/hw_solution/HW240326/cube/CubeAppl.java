package HW240326.cube;

import HW240326.cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cube1 = new Cube(23.1);
        Cube cube2 = new Cube(2);
        Cube cube3 = new Cube(0.245);

        System.out.println("cube1 perimeter is: " + cube1.perimeter());
        System.out.println("cube1 area is: " + cube1.area());
        System.out.println("cube1 volume is: " + cube1.volume());
        System.out.println();

        System.out.println("cube2 perimeter is: " + cube2.perimeter());
        System.out.println("cube2 area is: " + cube2.area());
        System.out.println("cube@ volume is: " + cube2.volume());
        System.out.println();

        System.out.println("cube3 perimeter is: " + cube3.perimeter());
        System.out.println("cube3 area is: " + cube3.area());
        System.out.println("cube3 volume is: " + cube3.volume());
    }
}
