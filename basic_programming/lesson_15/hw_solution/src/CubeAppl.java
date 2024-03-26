public class CubeAppl {
    public static void main(String[] args) {
        Cube cube = new Cube(6);

        int a = cube.perimeter();
        int b = cube.square();
        int c = cube.volume();

        System.out.println("Perimeter: " + a);
        System.out.println("Square: " + b);
        System.out.println("Volume: " + c);

    }
}
