package homework.ext.ext2;

public class App {
    public static void main(String[] args) {

        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(8,5);
        Triangle triangle = new Triangle(3,6);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
    }
}
