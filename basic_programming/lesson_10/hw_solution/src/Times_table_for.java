import java.util.Scanner;

public class Times_table_for {
    public static void main(String[] args) {
    printTableForNumber();
            }
            public static void printTableForNumber()
            {
               Scanner sc = new Scanner(System.in);

               int num;

               System.out.println("Enter a number");

               num = sc.nextInt();

               System.out.println("Multiplication table of " + num);

               for ( int i = 1; i <= 10; i++)
               {
                   System.out.println(num + " * " + i + " = " + (num * i));
               }
            }

        }

/*
Задача 1
Написать метод, принимающий с клавиатуры положительное число и печатающий затем
таблицу умножения для этого числа ( т.е. печатающий произведение этого числа
 на все числа от 1 до 9).
Использовать в решении цикл for.
 */
