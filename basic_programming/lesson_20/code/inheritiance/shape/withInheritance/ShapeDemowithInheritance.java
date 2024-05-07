package code.inheritiance.shape.withInheritance;



public class ShapeDemowithInheritance {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle1", 5);
        Circle circle2 = new Circle("Circle2", 9);
        Circle circle3 = new Circle("Circle3", 15);


        Square square1 = new Square("Square1", 5);
        Square square2 = new Square("Square2", 9);
        Square square3 = new Square("Square3", 15);


        Rectangle rectangle1 = new Rectangle("Rectangle1", 5,7);
        Rectangle rectangle2 = new Rectangle("Rectangle2", 15,17);
        Rectangle rectangle3 = new Rectangle("Rectangle3", 25,27);


        Shape[] shapes = {circle1,circle2,circle3,square1,square2,square3,rectangle1,rectangle2,rectangle3};


        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Площадь " + shapes[i].getTitle() + ": " + shapes[i].calculateArea());
            System.out.println("Периметр " + shapes[i].getTitle() + ": " + shapes[i].calculatePerimeter());

        }


    }
}
