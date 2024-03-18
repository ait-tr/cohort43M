package Homework;

public class HW240318 {
    public static void main(String[] args) {

        int n = 3;
        System.out.println("Cubed all integer numbers of " + n + ":");
        printCube(n);

        System.out.println("Multiplying " + n + " on all integer numbers of " + n + ":");
        printMultiply(n);

    }
    /*
    Задача1
С помощью цикла while написать метод, выводящий на экран куб числа от 1 до заданного числа n.
static void printCube( int n )

Пример:для числа n=3

1 в кубе 1
2 в кубе 8
3 в кубе 27
     */
    public static void printCube (int n) {

        int number = 1;

        while (number <= n){

            System.out.println(number + " cubed is " + (int) Math.pow(number, 3));
            number++;
        }
        System.out.println("\n~~~~~ end of printCube\n");
    }
    /*
    Задача 2
    С помощью цикла while написать метод, выводящий на печать результат умножения данного числа n на все целые числа от 0 до n
     */
    public static void printMultiply (int n){
        int result = 1;

        while (n > 0) {

            System.out.println(result + " * " + n + " = " + result * n);
            result = result * n;

            n--;
        }
        System.out.println("\n~~~~~ end of PrintMultiply\n");
    }
}
