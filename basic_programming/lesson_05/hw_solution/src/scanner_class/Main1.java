package scanner_class;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //Task 1
        //Написать программу, которая принимает с клавиатуры имя , фамилию и возраст (Ваши или воображаемого персонажа) и выводит в консоль эту информацию в следующем виде:
        //First name: Bill
        //Last name: Brown
        //Age: 25
        Scanner ourScanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String nameFirst = ourScanner.nextLine();
        System.out.println("Enter your Last name: ");
        String nameLast = ourScanner.nextLine();
        System.out.println("Enter your age: ");
        int age = ourScanner.nextInt();
        System.out.println("First name: " + nameFirst);
        System.out.println("Last name: " + nameLast);
        System.out.println("Age: " + age);

        // Task 2
        //аписать программу, выводящую на экран ASCII значение символа.
        //Пример: 'А' результат - 65
        char ch = 'A';
        int b2;
        b2 = (int)ch;
        System.out.println("Результат " + b2);
    }


}
