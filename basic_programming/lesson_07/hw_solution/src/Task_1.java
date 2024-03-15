/*
       Задача 1
Написать метод, считающий сумму двух целых чисел и возвращающий результат в основную программу.
Значения этих чисел должны передаваться в качестве аргументов метода.
Затем, в методе main вывести полученный результат на экран
        */

public class Task_1 {
    public static void main(String[] args) {

       int result = sum(2, 5);
       System.out.println( "Result " + result );
    }
    public static int sum(int a, int b) {

        int x = a + b;
        return x;
    }
}
