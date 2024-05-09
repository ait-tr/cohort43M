package homework.homework1;

import java.util.Random;

public class ShapeService {
    private static final Random random = new Random();

    static  Shape[] createRandomShapesArray(double minSize, double maxSize){
        double size = random.nextDouble(maxSize - minSize + 1) + minSize;
        return new Shape[(int) size];
    }

    static void fillArrayWithRandomShapes(Shape[] shapes, double min, double max){
        for (double i = 0; i < shapes.length; i++){
            double shapeType = random.nextDouble(5);
            switch ((int) shapeType) {
                case 0:
                    shapes[(int) i] = new Circle(random.nextDouble() * (max - min) + min);
                    break;
                case 1:
                    shapes[(int) i] = new Rectangle(random.nextDouble() * (max - min) + min,
                            random.nextDouble() * (max - min) + min);
                    break;
                case 2:
                    double side1 = random.nextDouble() * (max - min) + min;
                    double side2 = random.nextDouble() * (max - min) + min;
                    double side3 = random.nextDouble() * (max - min) + min;
                    shapes[(int) i] = new Triangle(side1, side2, side3);
                    break;
            }
        }
    }
    static void printShapesInfo(Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape != null) {
                shape.printInfo();
                System.out.println();
            }
        }
    }
    static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            if (shape != null) {
                totalArea += shape.getArea();
            }
        }
        return totalArea;
    }

    static double getTotalPerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            if (shape != null) {
                totalPerimeter += shape.getPerimeter();
            }
        }
        return totalPerimeter;
    }
}

