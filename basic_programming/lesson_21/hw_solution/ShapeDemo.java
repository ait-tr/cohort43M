package homework_shape;

import java.util.Arrays;

import static homework_shape.ShapeSevice.createRandomShape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = createRandomShape(3);
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + " Perimetr is " + shape.calculatePerimetr()+" " + "Area is " + shape.calculateArea());
        }
    }
}