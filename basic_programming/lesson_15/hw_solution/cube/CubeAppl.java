package cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cube1 = new Cube(7);
        Cube cube2 = new Cube(10);
        System.out.println("Perimeter of "+ cube1.toString() + " is " + cube1.perimeter(cube1.getSide()));
        System.out.println("Perimeter of "+ cube2.toString() + " is " + cube2.perimeter(cube2.getSide()));
        System.out.println("Square of "+ cube1.toString() + " is " + cube1.square(cube1.getSide()));
        System.out.println("Square of "+ cube2.toString() + " is " + cube2.square(cube2.getSide()));
        System.out.println("Volume of "+ cube1.toString() + " is " + cube1.volume(cube1.getSide()));
        System.out.println("Volume of "+ cube2.toString() + " is " + cube2.volume(cube2.getSide()));
    }
}
