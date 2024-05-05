import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(101);
        int number2 = random.nextInt(101);
        int number3 = random.nextInt(101);
        int number4 = random.nextInt(101);

        System.out.println("Случайные числа:");
        System.out.println("Число 1: " + number1);
        System.out.println("Число 2: " + number2);
        System.out.println("Число 3: " + number3);
        System.out.println("Число 4: " + number4);

        int maxNumber = Math.max(Math.max(number1, number2), Math.max(number3, number4));

        System.out.println("Максимальное число: " + maxNumber);
    }
}
