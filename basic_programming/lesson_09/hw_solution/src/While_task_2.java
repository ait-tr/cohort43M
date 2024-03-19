public class While_task_2 {
    public static void main(String[] args) {

        printMultiply(99);
    }

    public static void printMultiply(int n) {

        int i = 0;

        while (i <= n){
         System.out.println(n + " * " + i + " = " + n * i);
           i++;
        }

        }

    }


/*
Задача 2
С помощью цикла while написать метод, выводящий на печать результат умножения
 данного числа n на все целые числа от 0 до n
 */
