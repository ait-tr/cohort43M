package task_5;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четырехзначное число:");
        String input = scanner.nextLine();

        if (input.length() != 4){
            System.out.println("Ошибка: введено нечетырехзначное число");
            return;
        }
        int sumFirstPaar = Character.getNumericValue(input.charAt(0)) + Character.getNumericValue(input.charAt(1));
        int sumLastPaar = Character.getNumericValue(input.charAt(2)) + Character.getNumericValue(input.charAt(3));
        System.out.println("Число " + input + (sumFirstPaar == sumLastPaar ? " является счастливым билетом." : " НЕ является счастливым билетом."));
    }
}
