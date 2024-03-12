package scanner_class;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        /*
        Task 1
Написать программу, которая принимает с клавиатуры имя , фамилию и возраст
(Ваши или воображаемого персонажа) и выводит в консоль эту информацию в следующем виде:
First name: Bill
Last name: Brown
Age: 25
         */

        Scanner ourScanner = new Scanner(System.in); // создание сканера

        System.out.println("Enter your name");
        String name = ourScanner.nextLine(); // команда введение строки с клавиатуры

        System.out.println("Enter a surname");
        String surname = ourScanner.nextLine();

        System.out.println("Enter age");
        int age = ourScanner.nextInt();

        System.out.println("The name is " + name + " " + surname + " , age is " + age );
    }

}
