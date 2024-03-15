/*
       Задача 2*
Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы Цельсия
по формуле С = 5*(F-32)/9. Значение градусов Фаренгейта должно передаваться как аргумент метода.
Метод должен возвращать полученное значение в основную программу.
Затем, в методе main вывести полученное значение на экран.
        */

public class Task_2 {
    public static void main(String[] args) {
        double tempF = 451.0;
        double result = convertToCelsius1(tempF);
        Math.round(result);

    System.out.println(tempF + "F -> " + Math.round(convertToCelsius(tempF)) + "C");
    }

    public static double convertToCelsius(double tempF) {

        double tempC = 5 * (tempF - 32.0)/9.0;

        return tempC;
    }

    public static double convertToCelsius1(double tempF) {

        return 5 * (tempF - 32.0)/9.0;
    }


}
