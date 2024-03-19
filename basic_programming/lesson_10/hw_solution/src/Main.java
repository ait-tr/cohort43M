import java.util.Scanner;
public class Main {
    /*
    Написать метод, принимающий с клавиатуры положительное число и печатающий затем таблицу умножения
    для этого числа ( т.е. печатающий произведение этого числа на все числа от 1 до 10).
    Использовать в решении цикл for.
     */
    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Positive number");
            return;
        }
        System.out.println("Multiplication table for numbers " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        scanner.close();
    }
}
