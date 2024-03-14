package hw240314;

import java.util.Scanner;

public class HW2403141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // Задача 1
        System.out.println("Enter integer a");
            int a = scanner.nextInt();
        System.out.println("Enter integer b");
            int b = scanner.nextInt();

            calculateSum(a, b);
        //System.out.println("Summa a and b is " + calculateSum(a, b));
        System.out.println("------end of calculateSum------\n");

        // Задача 2
        System.out.println("Enter temperature in degrees Fahrenheit");
            double F = scanner.nextDouble();

        System.out.println("Temperature " + F + "F = " + convertFtoC(F) + "C");
        System.out.println("------end of convertFtoC------\n");
    }
/*
Задача 1
Написать метод, считающий сумму двух целых чисел и возвращающий результат в основную программу.
Значения этих чисел должны передаваться в качестве аргументов метода.
Затем, в методе main вывести полученный результат на экран
 */
public static int calculateSum (int a, int b){
    int sum = a + b;
    System.out.println("Summa a and b is " + sum);
    return sum;
}

/*
Задача 2
Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы Цельсия
по формуле С = 5*(F-32)/9.
Значение градусов Фаренгейта должно передаваться как аргумент метода.
Метод должен возвращать полученное значение в основную программу.
Затем, в методе main вывести полученное значение на экран.
 */
    public static double convertFtoC (double F) {
        double tempC = 5 * (F - 32) / 9;
        return tempC;
    }
}
