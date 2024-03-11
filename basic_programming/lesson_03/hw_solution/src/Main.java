import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     /*
        Задача 1.
        Написать программу, выводящую на экран результат деления двух чисел 25 и 3.
        Результат не должен быть округлен до целых.
        Посчитать также остаток от деления этих чисел.
     */
        float a, b, result;
        a = 25;
        b = 3;

        int reminder;

        result = a / b;

        reminder = (int)(a % b);

        System.out.println("25 / 3 = " + result);
        System.out.println("reminder from 25 / 3 is " + reminder);

    /*
        Задача 2.
        Написать программу, выводящую на экран значение переменной типа инт в квадрате.
        Предварительно обьявите эту переменную и задайте ее значение.
        (Возведение в квадрат равносильно умножению числа на себя)
     */

        int c;
        c = 2;
        c = c*c;

        System.out.println("c^2 = " + c);
    }
}
