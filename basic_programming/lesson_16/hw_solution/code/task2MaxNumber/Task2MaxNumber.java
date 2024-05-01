package task2MaxNumber;

import java.util.Scanner;

public class Task2MaxNumber {
    public static void main(String[] args) {
        /*Task 2
        -Запишите в 4 переменные случайные числа от 0 до 100
        -Выведите все 4 на экран
        -Программа должна определить максимальное из этих четырех чисел
        -Результат вывести на экран */
        int a=1;
        int b=3;
        int c=10;
        int d=0;
        System.out.println("We have numbers "+a+" "+b+" "+c+" "+d+" ");
        int max =a;
        if (b>max){
            max= b;
        }
        if (c>max){
            max=c;
        }
        if(d>max){
            max=d;
        }
        System.out.println("Max number "+max);






//************
    }

} //end program
