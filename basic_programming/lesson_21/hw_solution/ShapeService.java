import java.util.Random;

public class ShapeService {
    private Random random;

    public ShapeService() {
        this.random = new Random();
    }

    // Метод для создания массива фигур с рандомным размером
    public Shape[] createRandomShapesArray(int minSize, int maxSize) {
        int size = random.nextInt(maxSize - minSize + 1) + minSize;
        return new Shape[size];
    }

    // Метод для наполнения массива рандомными фигурами с произвольными параметрами
    public void fillArrayWithRandomShapes(Shape[] shapes, double minSide, double maxSide) {
        for (int i = 0; i < shapes.length; i++) {
            int randomShape = random.nextInt(3); // Генерируем случайное число от 0 до 2
            switch (randomShape) {
                case 0:
                    shapes[i] = new Circle(random.nextDouble() * (maxSide - minSide) + minSide);
                    break;
                case 1:
                    shapes[i] = new Square(random.nextDouble() * (maxSide - minSide) + minSide);
                    break;
                case 2:
                    double side1 = random.nextDouble() * (maxSide - minSide) + minSide;
                    double side2 = random.nextDouble() * (maxSide - minSide) + minSide;
                    double side3 = random.nextDouble() * (maxSide - minSide) + minSide;
                    shapes[i] = new Triangle(side1, side2, side3);
                    break;
            }
        }
    }

    // Метод для вывода информации о каждой фигуре и ее площади и периметре
    public void printShapesInfo(Shape[] shapes) {
        double totalArea = 0;
        double totalPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                Circle circle = (Circle) shapes[i];
                double area = circle.calculateArea();
                double perimeter = circle.calculatePerimeter();
                totalArea += area;
                totalPerimeter += perimeter;
                System.out.println("Фигура: Круг, Площадь: " + area + ", Периметр: " + perimeter);
            } else if (shapes[i] instanceof Square) {
                Square square = (Square) shapes[i];
                double area = square.calculateArea();
                double perimeter = square.calculatePerimeter();
                totalArea += area;
                totalPerimeter += perimeter;
                System.out.println("Фигура: Квадрат, Площадь: " + area + ", Периметр: " + perimeter);
            } else if (shapes[i] instanceof Triangle) {
                Triangle triangle = (Triangle) shapes[i];
                double area = triangle.calculateArea();
                double perimeter = triangle.calculatePerimeter();
                totalArea += area;
                totalPerimeter += perimeter;
                System.out.println("Фигура: Треугольник, Площадь: " + area + ", Периметр: " + perimeter);
            }
        }

        System.out.println("Общая площадь всех фигур: " + totalArea);
        System.out.println("Общий периметр всех фигур: " + totalPerimeter);
    }
}
