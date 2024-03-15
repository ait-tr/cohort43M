public class Main {


    public static void main(String[] args) {

        calculateArea(15.5);
        calculateArea(20.0);
        calculateArea(30.0);

        double fahrenheit = 451;


        System.out.println(fahrenheit + " F -> " + convertCelsius(fahrenheit) + " C");

        double inch = 1000;
        System.out.println(inchToMeter(1000));


    }


    public static double calculateArea(double radius) {

        double area = Math.PI * radius * radius;
        System.out.println("Circle area is " + area);
        // double perimetr = 2 * Math.PI * radius;
        return area;
    }



//15.03.2024
    /*Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы Цельсия по формуле С = 5*(F-32)/9.
    Значение градусов Фаренгейта должно передаваться как аргумент метода.
    Метод должен возвращать полученное значение в основную программу.
    Затем, в методе main вывести полученное значение на экран.*/

    public static double convertCelsius(double fahrenheit) {


        double celsius = 5 * (fahrenheit - 32.0)/9.0;
        return celsius;

    }
    public static double convertCelsius1(double fahrenheit) {


        return 5 * (fahrenheit - 32.0) / 9.0;

    }
        //Написать метод для перевода дюймов в метры. Один дюйм это 0.0254 метра

        public static double inchToMeter (double inch){
            double meter = 0.0254 * inch;
            return meter;

    }}



