package homework.homework1;

public class App {
    public static void main(String[] args) {

        Shape[] shapes = ShapeService.createRandomShapesArray(10,20);
        ShapeService.fillArrayWithRandomShapes(shapes, 1,10);
        ShapeService.printShapesInfo(shapes);

        double totalArea = ShapeService.getTotalArea(shapes);
        System.out.println("Total area: " + totalArea);

        double totalPerimeter = ShapeService.getTotalPerimeter(shapes);
        System.out.println("Total perimeter: " + totalPerimeter);

    }
}
