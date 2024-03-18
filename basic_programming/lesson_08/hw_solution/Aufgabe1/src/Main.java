import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (1-7): ");
        int dayNumber = scanner.nextInt();
        scanner.close();

        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресенье";
                break;
            default:
                dayName = "Неверный ввод. Пожалуйста, введите число от 1 до 7.";
        }

        System.out.println("День недели: " + dayName);
    }
}
