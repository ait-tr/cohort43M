public class Main {
    /*Есть две переменные целого типа. Написать программу, выводящую на экран сумму их значений,
    а в том в случае, если эти числа равны, должна выводиться двойная сумма.
            Пример: 1 + 2 -> 3
            3 + 2 -> 5
            2 + 2 -> 8
    */
    public static void main(String[] args) {
        int a,b;
        a = 4;
        b = 4;

        if (a != b){
            System.out.println(a+b);
        }
        else if (a == b) {
            System.out.println((a + b) * 2);
        }

        /*
        Есть три переменные целого типа. Написать программу, которая сравнивает эти числа и выводит
        на экран результат:
        All numbers are equal если они равны
        All numbers are different если все они все разные
        Some numbers are equal если какие-то из них равны
         */

        int x,y,z;
        x = 1;
        y = 10;
        z = 14;

        if (x == y && y == z){
            System.out.println("All number are equal");
        }
        else if (x == y || x == z || y == z){
            System.out.println("Some numbers are equal");
        }
        else{
            System.out.println("All numbers are different");
        }

    }

}
