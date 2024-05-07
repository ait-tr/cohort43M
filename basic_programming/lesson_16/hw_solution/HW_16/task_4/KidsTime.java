package task_4;

import java.util.Scanner;

public class KidsTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Что ты, дорогой, получил сегодня в школе? Введи число от 1 до 12");
        int number = scanner.nextInt();

        int time_start = 45;
        int time_add;
        int time_finish;


        switch (number) {
            case 12, 11, 10:
                time_add = 60;
                time_finish = time_start + time_add;
                System.out.println("Я так рада! Ты такой молодец) Сегодня время просмотра телевизора составляет "
                + time_finish + " минут");
                break;
            case 9, 8, 7:
                time_add = 45;
                time_finish = time_start + time_add;
                System.out.println("Молодец, это хороший результат) 12Сегодня время просмотра телевизора составляет "
                        + time_finish + " минут");
                break;
            case 6, 5, 4:
                time_add = 15;
                time_finish = time_start + time_add;
                System.out.println("Окей, сегодня время просмотра телевизора составляет " +
                        time_finish + " минут");
                break;
            case 3, 2, 1:
                time_add = -30;
                time_finish = time_start + time_add;
                System.out.println("Слушай, это просто ужасно. Тебе стоит побольше времени уделить учебе." +
                        "Так что сегодня время просмотра телевизора составляет " +
                        time_finish + " минут");
                break;
            default:
                System.out.println("Ты ввел неверное число");
        }
    }
}
