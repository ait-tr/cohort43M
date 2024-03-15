import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatur Farenheit: ");
        double f = scanner.nextDouble();
        System.out.println("Temperatur in Celcium: " + farenheitToCelcius(f));
    }

    public static double farenheitToCelcius(double f) {
        return 5 * (f - 32) / 9;
    }
}