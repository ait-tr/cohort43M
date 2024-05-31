package code.generics.practice.example2;

public class FigureExample {
    public static void main(String[] args) {
        // пример на Rectangle с Integer

        Rectangle<Integer> rInt = new Rectangle<>(10,30);
        double areaRectInt = rInt.area();
        System.out.println("Rectangle area = " + areaRectInt);

        // пример на Rectangle с Double

        Rectangle<Double> rDouble = new Rectangle<>(10.5,52.2);
        double areaRectDouble = rDouble.area();
        System.out.println("Rectangle area = " + areaRectDouble);

        // пример на Circle с Float

        Circle<Float> cFloat = new Circle<>(10.5f);
        double areaCircleFloat = cFloat.area();
        System.out.println("Circle area = " + areaCircleFloat);


    }
}
