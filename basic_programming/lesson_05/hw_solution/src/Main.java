import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*TASK1
Написать программу, которая принимает с клавиатуры имя , фамилию и возраст (Ваши или воображаемого персонажа) и выводит в консоль эту информацию в следующем виде:
First name: Bill
Last name: Brown
Age: 25*/
        Scanner scanner = new Scanner(System.in);
        Scanner name;
        System.out.print("Input a First name: ");
        String firstname = scanner.nextLine();
        System.out.print("Input a Last name: ");
        String lastname = scanner.nextLine();
        System.out.print("Input a Age: ");
        int age = scanner.nextInt();

        /*TASK2 Написать программу, выводящую на экран ASCII значение символа.
                Пример: 'А' результат - 65*/

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);
        int asciiValue = (int) symbol;
        System.out.println("ASCII значение символа '" + symbol + "' - " + asciiValue);

    }
}
