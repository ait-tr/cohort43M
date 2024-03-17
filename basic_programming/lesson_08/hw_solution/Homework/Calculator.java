package Homework;

import java.util.Scanner;

public class Calculator {

    //Calculator
    public static void calculator (){
        double num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = scanner.nextDouble ();

        System.out.println("Enter second number");
        num2 = scanner.nextDouble ();

        String trash = scanner.nextLine(); //записывает пустоту в сканер, чтобы почистить мусор из буфера, иначе мусор мешает работать. Пишется только в случае, если не работает без этого

        System.out.println("Enter math operation sign ( +, -, *, /)");
        String mathOperator = scanner.nextLine();

        switch (mathOperator){

            case "+":
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;

            case "-":
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;

            case "*":
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;

            case "/":
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;

            default:
                System.out.println("Wrong input");
        }


    }

    public static void main(String[] args) {
        calculator();

    }
}
