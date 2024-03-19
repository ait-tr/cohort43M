public class Main {
    public static void main(String[] args) {
        //Task 1
        //Пусть есть две переменные целого типа a и b. Используя логические операторы написать выражение,
        // результат которого будет true если значение хотя бы одной из этих переменных равно 10 или их сумма равна 10.
        int a1 = 1;
        int b1 = 10;
        if((a1 + b1) == 10 || a1 == 10 || b1 == 10) {
            System.out.println(" True ");
        }
        int a2 = 5;
        int b2 = 5;
        boolean result = (a2 + b2) == 10 || a2 == 10 || b2 == 10;
            System.out.println(result);
    }
}
