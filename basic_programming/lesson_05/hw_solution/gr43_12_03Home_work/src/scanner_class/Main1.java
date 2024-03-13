package scanner_class;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
          /* Task 1
             Написать программу, которая принимает с клавиатуры имя ,
             фамилию и возраст (Ваши или воображаемого персонажа) и
             выводит в консоль эту информацию в следующем виде:

             First name: Bill

             Last name: Brown

             Age: 25      */

        Scanner ourScanner = new Scanner(System.in);
        System.out.println("Введите имя ");
        String name = ourScanner.nextLine();
        System.out.println("Введите фамилию ");
        String surname = ourScanner.nextLine();
        System.out.println("Введите ваш возраст");
        int age = ourScanner.nextInt();
        System.out.println("First name: "+name);
        System.out.println();
        System.out.println("Last name : "+surname);
        System.out.println();
        System.out.println("Age :" + age);
    }
}
