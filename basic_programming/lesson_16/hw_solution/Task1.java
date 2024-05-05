import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3:");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Вы ввели число 1");
        } else if (number == 2) {
            System.out.println("Вы ввели число 2");
        } else if (number == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели некорректное число");
        }
    }
}
