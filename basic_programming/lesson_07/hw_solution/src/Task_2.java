/*
       Задача 2*
Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы Цельсия
по формуле С = 5*(F-32)/9. Значение градусов Фаренгейта должно передаваться как аргумент метода.
Метод должен возвращать полученное значение в основную программу.
Затем, в методе main вывести полученное значение на экран.
        */

public class Task_2 {
    public static void main(String[] args) {
        double result;
    result = calculateTemp(70);
    System.out.println(result);
    }

    public static double calculateTemp(double tempF) {

        double tempC = 5*(tempF - 32)/9;

        return tempC;



    }
}
