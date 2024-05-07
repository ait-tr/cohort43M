package task_2;
import java.util.Random;


public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);

        System.out.println("Сгенерированные числа: ");
        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);
        System.out.println("Число 3: " + num3);
        System.out.println("Число 4: " + num4);

        int max = Math.max(num1, Math.max(num2, Math.max(num3, num4)));

        System.out.println("Максимальное число: " + max);
    }

}
