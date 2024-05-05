import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int mark = random.nextInt(13);
        int remainingTime = 45;

        System.out.println("Оценка: " + mark);

        switch (mark) {
            case 10:
            case 11:
            case 12:
                System.out.println("Вы очень рады! Добавляем 1 час к времени просмотра ТВ.");
                remainingTime += 60;
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Нейтральное отношение. Добавляем 45 минут к времени просмотра ТВ.");
                remainingTime += 45;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Огорчены. Оставляем только 15 минут для просмотра ТВ.");
                remainingTime = 15;
                break;
            default:
                System.out.println("Трагедия! Сегодня ТВ смотреть запрещено.");
                remainingTime = 0;
                break;
        }

        System.out.println("Оставшееся на сегодня время для просмотра ТВ: " + remainingTime + " минут");
    }
}