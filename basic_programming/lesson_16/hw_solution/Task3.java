import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7: ");
        int day = scanner.nextInt();

        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
            case 7:
                dayOfWeek = "Выходной";
                break;
            default:
                dayOfWeek = "Некорректный день недели";
                break;
        }

        System.out.println(dayOfWeek);
        scanner.close();
    }
}