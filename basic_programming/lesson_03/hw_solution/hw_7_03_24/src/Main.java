public class Main {

    public static void main(String[] args) {
         /*
         Задача 1.
Написать программу, выводящую на экран результат деления двух чисел 25 и 3.
Результат не должен быть округлен до целых. Посчитать также остаток от деления этих чисел.
          */

        double numberOne = 25;
        double numberTwo = 3;
        double result = numberOne / numberTwo;
        int remainder = 25 % 3;

        System.out.println(result);
        System.out.println(remainder);


        /*
Задача 2.
Написать программу, выводящую на экран значение переменной типа инт в квадрате.
Предварительно обьявите эту переменную и задайте ее значение.
( Возведение в квадрат равносильно умножению числа на себя)
 */
        int x = 57;
        int square = x * x;

        System.out.println(square);
    }

}

