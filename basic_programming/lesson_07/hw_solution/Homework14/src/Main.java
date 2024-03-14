public class Main {


    public static void main(String[] args) {

    calculateArea(15.5);
    calculateArea(20.0);
    calculateArea(30.0);
    }


    public static double calculateArea(double radius) {

        double area = Math.PI * radius * radius;
        System.out.println("Circle area is " +area);
       // double perimetr = 2 * Math.PI * radius;
        return area;
    }




}
