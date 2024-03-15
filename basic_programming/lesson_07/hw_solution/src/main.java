import java.util.Scanner;

public class main {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Imput number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Imput number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("SUMMA: " + sum(num1, num2));
    }
}