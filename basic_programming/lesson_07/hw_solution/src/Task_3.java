/*
Написать метод для перевода дюймов в метры. Один дюйм 0.25 метра.
m = inch * 0.0254
 */


public class Task_3 {
    public static void main(String[] args) {
    double inch = 1000;
    System.out.println(inchToMeter(1000));


    }

    public static double inchToMeter(double inch) {
        double meter = 0.0254 * inch;
        return meter;

    }
}
