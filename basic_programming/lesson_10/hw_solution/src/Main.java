import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        //Написать метод, принимающий с клавиатуры положительное число и печатающий
        // затем таблицу умножения для этого числа ( т.е. печатающий произведение
        // этого числа на все числа от 1 до 10).
        //Использовать в решении цикл for.
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number from 1 to 10: ");
        int num = scanner.nextInt();
        printTable(num);

        // Task 2
        //Переписать задачу про треугольник из сегодняшнего занятия используя циклы while
        printTriangle(6);
    }


    public static void printTable(int i) {
        for(int j = 1; j <=10; j++)


            //int j = 1;
            //while (j <=10) {
                System.out.println(i + " * " + j + " = " + i * j);
               // j++;
            //}
            System.out.println("**************");


    }
    public static void printTriangle(int n){
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j<=i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }

}
