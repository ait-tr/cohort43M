package Homework;
import java.util.Arrays;

import java.util.Scanner;

public class HW240322 {
    /*
    Задача 1
Написать метод, принимающий строку и возвращающий целое число, равное длине строки
Пример: Hello -> 5

Задача 2
Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе и в верхнем регистре.
Пример: "Hello", "There" -> HELLOTHERE
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("** Type anything, I'll count symbols:");
        String strng = scanner.nextLine();
        System.out.println("The amount of symbols is: " + stringToNumber (strng));

        System.out.println("** Type anything for joining:");
        String str1 = scanner.nextLine();

        System.out.println("** Type again anything for joining:");
        String str2 = scanner.nextLine();

        joinStrings (str1, str2);




    }
    public static int stringToNumber (String strng) {
        int strngLength = strng.length();
        return strngLength;
    }

    public static void joinStrings (String str1, String str2){
        String concatResult;
        concatResult = str1 + str2;
        System.out.println();
        System.out.println(str1 + " + " + str2 + " -> " + concatResult.toUpperCase());
    }


}



