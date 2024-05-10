public class Main {

    public static void main(String[] args) {
        ShapeService shapeService = new ShapeService();
        int minSize = 10;
        int maxSize = 20;
        double minSide = 1.0;
        double maxSide = 10.0;

        Shape[] shapes = shapeService.createRandomShapesArray(minSize, maxSize);
        shapeService.fillArrayWithRandomShapes(shapes, minSide, maxSide);
        shapeService.printShapesInfo(shapes);
    }
}

