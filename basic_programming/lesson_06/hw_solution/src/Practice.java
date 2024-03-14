import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /*
        написать программу, определяющую является ли введенное с клавы целое число:
        - положительным
        - отрицательным
        - нулем
        Вывести результат на экран в виде:
        Number is negative /positive /zero
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number");

        int i = scanner.nextInt();

        if (i > 0) {
            System.out.println("Number is positive");
        }
        else if (i < 0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is 0");
        }
    }
}
