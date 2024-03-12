public class Main {
    public static void main(String[] args) {
        /*
        Пусть есть две переменные целого типа a и b.
        Используя логические операторы написать выражение, результат которого
        будет true если значение хотя бы одной из этих переменных равно 10 или
        их сумма равна 10.
         */
        int a = 7;
        int b = 3;
        boolean result =  a != b || a > b;
        System.out.println(result);

        int s = 10;
        int r = 4;
        boolean res = s != r || s > r || r < s;
        System.out.println(res);
    }
}
