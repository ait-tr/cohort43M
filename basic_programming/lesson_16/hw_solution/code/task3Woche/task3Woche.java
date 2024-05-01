package task3Woche;

import java.util.Scanner;

public class task3Woche {
    /*Task 3 (Использовать оператор switch)

    Программа просит пользователя ввести число от 1 до 7 Если число равно 1,
     выводим на консоль “Понедельник”
    , 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной” */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        int day = scanner.nextInt();
        switch (day) {
            case(1):
                System.out.println("Monday is "+day+" day");
                break;
            case(2):
                System.out.println("Tuesday is "+day+" day");
                break;
            case(3):
                System.out.println("Wednesday is "+day+" day");
                break;
            case(4):
                System.out.println("Thursday is "+day+" day");
                break;
            case(5):
                System.out.println("Friday is "+day+" day");
                break;
            case(6):
                System.out.println("Saturday is weekend");
                break;
            case(7):
                System.out.println("Sunday is weekend");
                break;
            default:
                System.out.println("enter a valid number");
        }














    }










}//***
