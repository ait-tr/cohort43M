public class While_task_2 {
    public static void main(String[] args) {

        System.out.println("Myltiply of 0 to n is " + printMultiply());
    }

    public static int printMultiply() {

        int multiply = 1;

        char i = 'n';

        while (i <= 'n'){
           multiply = multiply * i;
           i++;
        }
        return multiply;
        }

    }


/*
Задача 2
С помощью цикла while написать метод, выводящий на печать результат умножения
 данного числа n на все целые числа от 0 до n
 */
