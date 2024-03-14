public class Zadacha2 {
    public static void main(String[] args) {
        /* Задача 2*
     Написать метод, конвертирующий температуру из градусов Фаренгейта в
     градусы Цельсия по формуле С = 5*(F-32)/9.
     Значение градусов Фаренгейта должно передаваться как аргумент метода.
     Метод должен возвращать полученное значение в основную программу.
     Затем, в методе main вывести полученное значение на экран. */
        konverter(1);
        konverter(0);
    }
    public static double konverter(double f){
        double c = 5*(f-32)/9;

        System.out.println(c);

        return c;

    }
}
