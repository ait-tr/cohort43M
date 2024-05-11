package Shape;
import java.util.Random;
public class ShapeService {
    private Random random = new Random();

    // Метод для создания массива фигур с рандомным размером
    public Triangle[] createRandomTriangleArray(int minSize, int maxSize) {
        int size = random.nextInt(maxSize - minSize + 1) + minSize;
        Triangle[] triangles = new Triangle[size];
        return triangles;
    }

    // Метод для наполнения массива случайными кругами
    public void fillRandomCirclesArray(Triangle[] triangles, double minSite, double maxSite) {
        for (int i = 0; i < triangles.length; i++) {
            double sizeA= minSite + (maxSite - minSite) * random.nextDouble();
            double sizeB = minSite + (maxSite - minSite) * random.nextDouble();
            double sizeC = minSite + (maxSite - minSite) * random.nextDouble();
            double height = minSite + (maxSite - minSite) * random.nextDouble();

            triangles[i] = new Triangle("Triangle " + (i + 1), height, sizeA, sizeC, sizeB);
        }
    }

    // Метод для вывода информации о каждом круге и его площади и периметре
    public void printTrianglesInfo(Triangle[] triangles) {
        double totalArea = 0;
        double totalPerimeter = 0;
        for (int i = 0; i <triangles.length; i++) {
            double area = triangles[i].getArea();
            double perimeter = triangles[i].getPerimeter();
            totalArea += area;
            totalPerimeter += perimeter;
            System.out.println("Triangles: " + triangles[i].getTitle() + ", Area: " + area + ", Perimeter: " + perimeter);
        }


        System.out.println("Total area of all triangles: " + totalArea);
        System.out.println("Total perimeter of all triangles: " + totalPerimeter);
    }
}
