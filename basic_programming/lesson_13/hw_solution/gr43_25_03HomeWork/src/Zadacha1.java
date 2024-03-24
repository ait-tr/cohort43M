import java.util.Scanner;

public class Zadacha1 {
    /* Задача 1
Написать метод, принимающий строку и возвращающий целое число, равное длине строки
Пример: Hello -> 5 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:  ");
        String str = scanner.nextLine();
        int length = getLengthOfString(str);
        System.out.println("Длина строки " + length);

    }
    public static int getLengthOfString(String str) {
        return str.length();
    }
}
