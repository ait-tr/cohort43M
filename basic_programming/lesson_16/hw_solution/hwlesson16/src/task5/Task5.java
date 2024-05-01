package task5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter a four-digit number: ");
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();

        if (inputNumber.length() != 4) {
            System.out.println("Error: The input must be a four-digit number.");
            return;
        }

        int number = Integer.parseInt(inputNumber);

        if (isLuckyTicket(number)) {
            System.out.println("The number is a lucky ticket!");
        } else {
            System.out.println("The number is not a lucky ticket.");
        }
    }

    private static boolean isLuckyTicket(int number) {
        int firstTwo = number / 100;
        int lastTwo = number % 100;

        int sumFirstTwo = getDigitSum(firstTwo);
        int sumLastTwo = getDigitSum(lastTwo);

        return sumFirstTwo == sumLastTwo;
    }

    private static int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}