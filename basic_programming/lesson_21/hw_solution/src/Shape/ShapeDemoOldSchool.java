package Shape;

public class ShapeDemoOldSchool {
    public static void main(String[] args) {
        // Создаем экземпляр ShapeService
        ShapeService shapeService = new ShapeService();

        // Создаем массив случайных кругов
        Triangle[] triangles = shapeService.createRandomTriangleArray(3, 5);

        // Наполняем массив случайными кругами
        shapeService.fillRandomCirclesArray(triangles, 1.0, 10.0);

        // Выводим информацию о каждом круге и их площадь и периметр
        shapeService.printTrianglesInfo(triangles);
    }
}
