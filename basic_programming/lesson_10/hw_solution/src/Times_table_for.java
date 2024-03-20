import java.util.Scanner;

public class Times_table_for {
    public static void main(String[] args) {

      //  Scanner ourScanner = new Scanner(System.in);

       // System.out.println("Enter a number from 1 to 10");
      //  int i = ourScanner.nextInt();

        for(int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();

        }
    }
}

/*
Задача 1
Написать метод, принимающий с клавиатуры положительное число и печатающий затем
таблицу умножения для этого числа ( т.е. печатающий произведение этого числа
 на все числа от 1 до 10).
Использовать в решении цикл for.
 */
