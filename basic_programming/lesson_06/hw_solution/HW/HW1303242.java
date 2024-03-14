public class HW1303242 {
    public static void main(String[] args) {
        /*
        Задача 2
Есть три переменные целого типа. Написать программу, которая сравнивает эти числа
и выводит на экран результат:

All numbers are equal если они равны
All numbers are different если все они все разные
Some numbers are equal если какие-то из них равны
         */
        int a = 1;
        int b = 3;
        int c = 4;

        if (a == b & a == c & b == c)  {
            System.out.println("All numbers are equal");
        }
        else if (a != b & a != c & b != c){
            System.out.println("All numbers are different");
        }
        else if (a == b | a == c | b == c){
            System.out.println("Some numbers are equal");
        }
    }
}
