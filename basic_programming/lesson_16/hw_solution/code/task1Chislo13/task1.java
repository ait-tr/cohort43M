package task1Chislo13;

import java.util.Scanner;

public class task1 {
    /*
    Task 1
1.Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
2.Перепишите решение задачи с использованием switch вместо if-else */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1,2 или 3");
        int number = scanner.nextInt();
       if(number==1){
            System.out.println("One");}
            else if (number==2){
                System.out.println("Two");
            } else if(number==3){
            System.out.println("Three");
                    } else
           System.out.println("Enter right number");
        System.out.println("***********************");
        System.out.println("Switch");

            switch(number){
                case (3):
                    System.out.println("Three");
                    break;
                case (2):
                    System.out.println("Two");
                    break;
                case (1):
                    System.out.println("One");
                    break;
                default:
                    System.out.println("enter right number");
            }

    }
}
