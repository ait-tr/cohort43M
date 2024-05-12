package homework_shape;

import java.util.Random;

public class ShapeSevice{
    public static Shape[] createRandomShape(int count) {

        Random random = new Random();
        Shape[] shapes = new Shape[count];

        for (int i = 0; i < count; i++){
            int choice = random.nextInt(3);
            switch (choice){
                case 0:
                    double radius = random.nextDouble(5);
                    shapes[i] = new Circle(radius);
                    break;
                case 1:
                    double side = random.nextDouble(5);
                    shapes[i] = new Square(side);
                    break;
                case 2:
                    double sideA = random.nextDouble(5);
                    double sideB = random.nextDouble(5);
                    double sideC = random.nextDouble(5);
                    double pp =(sideA+sideB+sideC)/2;
                    shapes[i] = new Triangle(sideA,sideB,sideC,pp);
                    break;

            }
        }
        return shapes;

    }

}
