import java.util.Scanner;

public class Main {
    /*
    Task 1
Написать программу, которая принимает с клавиатуры имя, фамилию и возраст (Ваши или воображаемого персонажа)
и выводит в консоль эту информацию в следующем виде:

First name: Bill
Last name: Brown
Age: 25
     */

    public static void main(String[] args) {

        Scanner ourScanner = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = ourScanner.nextLine();
       // System.out.println("Your name is " + name);

        System.out.println("Enter your last name");
        String surname = ourScanner.nextLine();
       // System.out.println("Your name is " + surname);

        System.out.println("Enter your age");
        int age = ourScanner.nextInt();
       // System.out.println("Your age is " + age + '\n' + "=======================");

        System.out.println("First name: " + name + '\n' + "Last name: " + surname + '\n' + "Age: " + age);

    }
}
