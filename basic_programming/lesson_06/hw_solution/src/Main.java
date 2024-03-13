public class Main {

    public static void main(String[] args) {
        int a1,b1;
        a1=16;
        b1=16;
        if (a1==b1) {
            System.out.println( 2* (a1 + b1));
        }
        else{
            System.out.println(a1 + b1);
        }

        //Задача 1
        //Есть две переменные целого типа. Написать программу,
        // выводящую на экран сумму их значений, а в том в случае, если эти числа равны,
        // то должна выводиться двойная сумма.
        //Пример: 1 + 2 -> 3
        //3 + 2 -> 5
        //2 + 2 -> 8

        int a2,b2,c2;
        a2 = 53;
        b2 = 57;
        c2 = 53;

        if (a2 == b2 & a2 == c2) {
            System.out.println("All numbers are equal");
        }
        else if (a2 == b2 || a2 == c2 || b2 == c2) {
            System.out.println("Some numbers are equal");
        }
        else {
            System.out.println("All numbers are different");

        }

        //Задача 2
        //Есть три переменные целого типа.
        // Написать программу, которая сравнивает эти числа и выводит на экран результат:
        //
        //All numbers are equal если они равны
        //All numbers are different если все они все разные
        //Some numbers are equal если какие-то из них равны
    }
}
