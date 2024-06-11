package code.task3;

import java.util.Scanner;

public class PersonString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");

        String string = scanner.nextLine();

        try {
            int number = Integer.parseInt(string);
            System.out.println("Преобразованое число " + number);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
