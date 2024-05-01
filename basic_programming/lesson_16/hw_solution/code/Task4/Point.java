package Task4;

import java.util.Scanner;

public class Point {
    public static void main(String[] args) {

    int point = 7;
    int timeLeft = 45;

    System.out.println("Оценка: " + point + " Время просмотра: " + timeLeft + " минут");

    switch (point){
        case 10, 11, 12:
            System.out.println("Очень круто!");
            timeLeft += 60;
            break;
        case 7, 8, 9:
            System.out.println("Хорошо");
            timeLeft += 45;
            break;
        case 4, 5, 6:
            System.out.println("Окей");
            timeLeft += 15;
            break;
        case 3:
            System.out.println("Как жаль!");
            timeLeft -= 30;
            break;
        case 1, 2:
            System.out.println("Просмотр телевизора запрещен");
            timeLeft = 0;
            break;
        default:
            System.out.println("Некорректная оценка");
    }
        System.out.println("Оставшееся на сегодня время для просмотра ТВ: " + timeLeft + " минут");
    }
}
