package book;
import java.util.Scanner;
public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int inputInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
}