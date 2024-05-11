package Inheritans.ver2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle1", 13, 5.5);
        Rectangle rectangle = new Rectangle("Rectangle", 10, 3, 4);
        Triangle triangle = new Triangle("Triangle", 11, 13.4, 6.4);
        System.out.println("Circle: " + circle.calcArea());
        System.out.println("Rectangle: " + rectangle.calcArea());
        System.out.println("Triangle: " + triangle.calcArea());
    }
}
