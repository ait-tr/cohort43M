import java.util.Scanner;

public class daysOfTheWeek {
   /*
   Используя switch, написать программу, которая в зависимости от ввода пользователем цифр от 1 до 7 выводит на экран
   название соответствующего дня недели.
    */
   public static void main(String[] args) {
       weekdays();

   }
   public static void weekdays(){
       int a;
       Scanner scanner = new Scanner(System.in);

       System.out.println("Write a number from 1 to 7");
       a = scanner.nextInt();;

       switch (a){
           case 1:
               System.out.println("Monday");
               break;

           case 2:
               System.out.println("Tuesday");
               break;

           case 3:
               System.out.println("Wednesday");
               break;

           case 4:
               System.out.println("Thursday");
               break;

           case 5:
               System.out.println("Friday");
               break;

           case 6:
               System.out.println("Saturday");
               break;

           case 7:
               System.out.println("Sunday");
               break;

           default:
               System.out.println("It's too big! Try again)");
       }

   }



}
