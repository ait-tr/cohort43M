package scanner_class;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

    // чтение с клавиатуры с помощью сканнера

        Scanner ourScanner = new Scanner (System.in);

        System.out.println("Enter your name");

        String name = ourScanner.nextLine(); // введение строки с клавы
        // System.out.println("You have entered the word " + name);

        System.out.println("Enter your surname");
        String surname = ourScanner.nextLine();
        // System.out.println("You have entered the word " + surname);

        System.out.println("Enter your age");
        int age = ourScanner.nextInt();
        System.out.println("The name is " + name +" " + surname +" , age is " + age);





    }



}
