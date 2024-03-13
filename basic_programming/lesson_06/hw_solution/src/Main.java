public class Main {
    public static void main(String[] args) {


        /*
        Есть три переменные целого типа. Написать программу, которая сравнивает эти числа и
        выводит на экран результат:
          All numbers are equal если они равны
          All numbers are different если все они все разные
          Some numbers are equal если какие-то из них равны
         */

        int a = 3;
        int b = 7;
        int c = 3;

        if(a==b && b==c && c==a){
            System.out.println("All number are equal");
        }
        else if(a!=b && b!=c && a!=c){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Some numbers are equal");
        }



        /*
        Есть две переменные целого типа. Написать программу, выводящую на экран сумму их
        значений, а в том в случае, если эти числа равны, должна выводиться двойная сумма.
        Пример: 1 + 2 -> 3
        3 + 2 -> 5
        2 + 2 -> 8
         */

    }
}
