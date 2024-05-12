package hwlesson21.Inheritiance.task2;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Circle");
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1.area());
        System.out.println();
        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle.area());
        System.out.println();
        System.out.println("Triangle");
        Triangle triangle = new Triangle(18.0, 8.0);
        System.out.println(triangle.area());
    }
}
