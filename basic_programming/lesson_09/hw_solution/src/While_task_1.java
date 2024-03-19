public class While_task_1 {

    public static void main(String[] args) {
    printCub();
    System.out.println(printCub());
        }


    public static int printCub(){

        int cub = 0;

        int n = 1;

        while ( n <= 3) {
            cub = n * n * n;
            n++;
        }
    System.out.println(cub);
        return cub;
    }

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
