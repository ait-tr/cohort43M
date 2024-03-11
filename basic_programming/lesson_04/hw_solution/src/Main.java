public class Main {
    public static void main(String[] args) {
        /* Пусть есть две переменные целого типа a и b.
        Используя логические операторы написать выражение,
        результат которого будет true если значение хотя бы
        одной из этих переменных равно 10 или их сумма равна 10.

         */

        int a,b;

        a = 8;
        b = 2;

        boolean result = (a == 10) || (b ==10) || (a+b == 10);

        System.out.println(result);


    }
}
