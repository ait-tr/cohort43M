import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Написать программу, выводящую на экран ASCII значение символа.
        Пример: 'А' результат - 65
         */

        char ch = 'A';
        System.out.println("ch = " + (int) ch);;

        /*
        Написать программу, которая принимает с клавиатуры имя , фамилию и возраст
        (Ваши или воображаемого персонажа) и выводит в консоль эту информацию в следующем виде:
        First name: Bill
        Last name: Brown
        Age: 25
         */
        Scanner ourScanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = ourScanner.nextLine();

        System.out.println("Enter your surname");
        String surname = ourScanner.nextLine();

        System.out.println("Enter your age");
        int age = ourScanner.nextInt();

        System.out.println("The name is " + name + " " + surname + ", age is " + age);


    }
}
