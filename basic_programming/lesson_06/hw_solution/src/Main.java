import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Задача 2
Есть три переменные целого типа. Написать программу, которая сравнивает эти числа и выводит на экран результат:

All numbers are equal если они равны
All numbers are different если все они все разные
Some numbers are equal если какие-то из них равны*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Guess a number a");
        int a= scanner.nextInt();
        System.out.println("Guess a number b");
        int b= scanner.nextInt();
        System.out.println("Guess a number c");
        int c= scanner.nextInt();

        if (a == b && b== c){
            System.out.println("All numbers are equal");}
        else if (a!=b&&b!=c){
            System.out.println("All numbers are different");}
        else if ((a==b && b!=c) || (a!=b && b==c) || (a==c && c!=b)){
            System.out.println("Some numbers are equal");}



   /* Задача 1
    Есть две переменные целого типа. Написать программу, выводящую на экран сумму их значений, а в том в случае, если эти числа равны, должна выводиться двойная сумма.
            Пример: 1 + 2 -> 3
            3 + 2 -> 5
            2 + 2 -> 8*/

   System.out.println("Guess a number x");
    int x= scanner.nextInt();
    System.out.println("Guess a number y");
    int y= scanner.nextInt();
    int result;
   if (x==y){
      result= (x+y)*2;}
      else {
       result=x+y;}
        System.out.println("Result= " + result);
   }
   }





