public class Main {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = convertToFahrenheit(celsius);
        System.out.printf("Температура %.2f градусов Цельсия равна %.2f градусов Фаренгейта%n", celsius, fahrenheit);
    }
    public static double convertToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32.0;
    }
}
