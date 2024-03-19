import java.util.Scanner;

public class Main {
    public static void printCube(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i + " в кубе " + (i * i * i));
            i++;
        }
    }

    public static void main(String[] args) {
        // Пример:для числа n=3
        printCube(3);
    }
}
