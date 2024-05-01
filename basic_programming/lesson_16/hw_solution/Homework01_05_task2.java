import java.util.Random;
import java.util.Scanner;

public class Homework01_05_task2 {
   /* Task 2
 Запишите в 4 переменные случайные числа от 0 до 100
 Выведите все 4 на экран
 Программа должна определить максимальное из этих четырех чисел
 Результат вывести на экран*/
   public static void main(String[] args) {
       Random random = new Random();
       int num1 = random.nextInt(101);
       int num2 = random.nextInt(101);
       int num3 = random.nextInt(101);
       int num4 = random.nextInt(101);
       System.out.println("Random numbers : " + num1 + " " + num2 + " " + num3 + " " + num4 + " ");

int maxNum = Math.max(Math.max(num1, num2),Math.max(num3, num4));
System.out.println("The maximum numbers is :" + maxNum);


   }


}
