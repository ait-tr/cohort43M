package Cube.model;

import Cube.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cube = new Cube(32);


        cube.perimeter();
        cube.displayPerimeter();

        cube.area();
        cube.displayArea();

        cube.scope();
        cube.displayScope();


    }
}
