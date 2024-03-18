public class Main {
    public static void main(String[] args) {

        /*
        С помощью цикла while написать метод,
        выводящий на экран куб числа от 1 до заданного числа n.
        static void printCube( int n )

Пример:для числа n=3

1 в кубе 1

2 в кубе 8

3 в кубе 27
         */

        int n = 3;
        printCube(n);

        int b = 5;
        multiply(b);
    }

    public static void printCube(int n) {
        System.out.println("Task 1:");

        int i = 1;


        while (i <= n){

            System.out.println("Cube of " + i + "  is " + (i*i*i));
            i++;

        }

        System.out.println("\n");
    }




    public static void multiply (int b){

        System.out.println("Task 2:");

        int i = 0;

        while (i <= b){
            System.out.println("The number " + i + " multiply " + b + " is " + (i*b));
            i++;
        }




    }

}

    /*
    Задача 2

    С помощью цикла while написать метод,
    выводящий на печать результат умножения данного числа n
    на все целые числа от 0 до n

     */




