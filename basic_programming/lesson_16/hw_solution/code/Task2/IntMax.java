package Task2;

public class IntMax {
    public static void main(String[] args) {

        int num1 = 59;
        int num2 = 19;
        int num3 = 34;
        int num4 = 72;

        System.out.println("Первое число: " + num1);
        System.out.println("Второе число: " + num2);
        System.out.println("Третье число: " + num3);
        System.out.println("Четвертое число: " + num4);

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }

        System.out.println("Максимальное число: " + max);

    }
}