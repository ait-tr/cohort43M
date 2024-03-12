import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner askName = new Scanner(System.in);

             System.out.println("Enter your first name ");
        String firstName = askName.nextLine();

            System.out.println("Enter your surname ");
        String surName = askName.nextLine();

            System.out.println("Enter your age ");
        String age = askName.nextLine();

        System.out.println(" "); //empty line

        System.out.println("First name:  " + firstName);
        System.out.println("Last name: " + surName);
        System.out.println("Age: " + age);
        System.out.println(" "); //empty line

    //Task 1
    //Написать программу, которая принимает с клавиатуры имя ,
    // фамилию и возраст (Ваши или воображаемого персонажа)
    // и выводит в консоль эту информацию в следующем виде:
    //
    //First name: Bill
    //
    //Last name: Brown
    //
    //Age: 25

        char chSymb = 'A';
        int chS = (int) chSymb;

                System.out.println("result ASCII for " + chSymb + " = " +chS );

    //Task 2
    //Написать программу, выводящую на экран ASCII значение символа.
    //Пример: 'А' результат - 65
}
}
