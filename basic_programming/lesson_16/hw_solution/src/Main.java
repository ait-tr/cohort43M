import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3:");
        int enteredNumber = scanner.nextInt();
        // Task 1 (if - else)
        if (enteredNumber == 1) {
            System.out.println("Вы ввели число 1.");
        }
        else if (enteredNumber == 2) {
            System.out.println("Вы ввели число 2.");
        }
        else if (enteredNumber == 3) {
            System.out.println("Вы ввели число 3.");
        }
        else {
            System.out.println("Вы ввели некорректное число.");
        }
        // task 1 (switch)
        System.out.println("Введите число 1, 2 или 3:");
        int enteredNumber2 = scanner.nextInt();
        switch (enteredNumber2) {
            case 1:
                System.out.println("Вы ввели число 1.");
                break;
            case 2:
                System.out.println("Вы ввели число 2.");
                break;
            case 3:
                System.out.println("Вы ввели число 3.");
                break;
            default:
                System.out.println("Вы ввели некорректное число.");
        }
        // Task 2

        int num1 = 47;
        int num2 = 88;
        int num3 = 25;
        int num4 = 39;
        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);
        System.out.println("Число 3: " + num3);
        System.out.println("Число 4: " + num4);
        int max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        if (num4 > max){
            max = num4;
        }
        System.out.println("Максимальное число: " + max);

        //Task 3
        System.out.println("Введите число от 1 до 7:");
        int enteredNumber3 = scanner.nextInt();
        switch (enteredNumber3) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("выходной");
                break;
            case 7:
                System.out.println("выходной");
                break;
            default:
                System.out.println("Вы ввели некорректное число.");
        }
        scanner.close();

        // Task 4

        Random random = new Random();
        int score = random.nextInt(13);
        int remainingTime = 45;
        System.out.println("Оценка за контрольную работу: " + score);

        switch (score){
            case 12: case 11: case 10:
                System.out.println("Молодещ, я горжусь тобой! Ты получаешь +60 минут на ТВ!");
                remainingTime += 60;
                break;
            case 9: case 8: case 7:
                System.out.println("Молодец, неплохой результат. Ты получаешь +45 минут на ТВ!");
                remainingTime += 45;
                break;
            case 6: case 5: case 4:
                System.out.println("Могло бы быть и лучше. Ты получаешь +15 минут на ТВ!");
                remainingTime += 15;
                break;
            case 3:
                System.out.println("Очень плохо! Сегодня смотришь ТВ на 30 меньше!");
                remainingTime -= 30;
                break;
            default:
                System.out.println("Ужас! Сегодня не смотришь ТВ!");
                remainingTime = 0;
        }
        if (remainingTime > 60) {
            remainingTime = 60;
        }
        System.out.println("Оставшееся время для просмотра ТВ на сегодня: " + remainingTime + " минут");

    }
}
