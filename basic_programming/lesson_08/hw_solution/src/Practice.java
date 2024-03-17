import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        do {
            System.out.println("Geben Sie die erste Zahl ein: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Fehler: ungültige Eingabe! Bitte geben Sie eine Zahl ein:");
                scanner.next();
            }
            num1 = scanner.nextDouble();
        } while (Double.isNaN(num1));


        /*System.out.println("Geben Sie die erste Zahl ein: ");
        num1 = scanner.nextDouble();*/

        do {
            System.out.println("Geben Sie die zweite Zahl ein: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Fehler: ungültige Eingabe! Bitte geben Sie eine Zahl ein:");
                scanner.next();
            }
            num2 = scanner.nextDouble();
        } while (Double.isNaN(num2));


        /*System.out.println("Geben Sie die zweite Zahl ein: ");
        num2 = scanner.nextDouble();*/


                char sign;
                do {
                    System.out.println("Zeichen eingeben(+,-,*,/): ");
                    sign = scanner.next().charAt(0);

                    if (!(sign == '+' || sign == '-' || sign == '*' || sign == '/')) {
                        System.out.println("Fehler: ungültiger Operator!");
                    }
                } while (!(sign == '+' || sign == '-' || sign == '*' || sign == '/'));

                switch (sign) {
                    case '+':
                        System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 - num2));
                        break;
                    case '*':
                        System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 * num2));
                        break;
                    case '/':
                        System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 / num2));
                        break;
                }
            }
        }



