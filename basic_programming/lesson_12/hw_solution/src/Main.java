import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1.
        //Написать программу, выводящую на экран результат деления двух чисел 25 и 3. Результат не должен быть округлен до целых. Посчитать также остаток от деления этих чисел.

          //      Задача 2.
        //Написать программу, выводящую на экран значение переменной типа инт в квадрате. Предварительно обьявите эту переменную и задайте ее значение.
       // ( Возведение в квадрат равносильно умножению числа на себя)

/*
int x = 25;
int y = 3;
int sum = x/y;
int remainder =x%y;

System.out.println("result is " + sum );
System.out.println("remainde is " + remainder);
// 2
        int a = 25;
        long sum1 = a*a ;
        System.out.println(" Qudrat is " + sum1);

        /*Пусть есть две переменные целого типа a и b. Используя логические операторы написать выражение,
         результат которого будет true если значение хотя бы одной из этих переменных равно 10 или их сумма равна 10
         */

        {
            /*int a1=10  , b1=5;
            int suMma = a1+b1;
            boolean mean =(a1==10 || b1 !=10)^(a1!=10||b1==10)||( suMma==10);

            System.out.println(" Meaning is  " + mean);*/
        }
Scanner scanner = new Scanner(System.in);
        System.out.println("Our Help system. To see the info pleas enter menu number");
        System.out.println("  1. if");
        System.out.println("  2. switch");

        int choice = scanner.nextInt();


        System.out.println("\n");

        switch (choice){
             case 1:
                System.out.println("IF:");
                System.out.println("if(condition)\n{statements}");
                System.out.println("else\n {statements}");
                break;

            case 2:
                System.out.println("SWITCH:");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println("   statements");
                System.out.println("   break");
                System.out.println(".............");
                System.out.println("    default");
                System.out.println("     statements");
                System.out.println("}");
                break;

            default:
                System.out.println("Please enter 1 or 2");






        }
















    }
    }

    