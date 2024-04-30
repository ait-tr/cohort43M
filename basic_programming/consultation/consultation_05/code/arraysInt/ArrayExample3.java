package arraysInt;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество переменных: ");
        int numbers = scanner.nextInt();

        int[] xArray = new int[numbers];


        for (int i = 0; i < numbers; i++) {
            System.out.println("Пожалуйста введите " + i + " число: ");
            xArray[i] = scanner.nextInt();

        }

        System.out.println(Arrays.toString(xArray));

    }
}
