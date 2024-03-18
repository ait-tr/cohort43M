import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

              Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number of weeekday (1-7): ");
        int numberDay = scanner.nextInt ();
        switch (numberDay) {
            case 1:
                System.out.println("Monday ");
                break;
            case 2:
                System.out.println("Tuesday ");
                break;
            case 3:
                System.out.println("Wednesday ");
                break;
            case 4:
                System.out.println("Thursday ");
                break;
            case 5:
                System.out.println("Friday ");
                break;
            case 6:
                System.out.println("Saturday ");
                break;
            case 7:
                System.out.println("Sunday ");
                break;
            default:
                System.out.println("Are you sure? Only 7 days into a week. ");
        }
    scanner.close();
    }
    //Задача 1
    //Используя switch, написать программу,
    // которая в зависимости от ввода пользователем цифр от 1 до 7
    // выводит на экран название соответствующего дня недели.

    public class Practice {

        public static void calculator() {
                double num1, num2;
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter first number:");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number:");
                num2 = scanner.nextDouble();

                String trash = scanner.nextLine();
                // System.out.println("trash is" + trash + "end of trash");

                System.out.print("Enter sign( +,-,*,/): ");
                String sign = scanner.nextLine();

                switch (sign) {
                    case "+":
                        System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 + num2));
                        break;
                    case "-":
                        System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 - num2));
                        break;
                    case "*":
                        System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 * num2));
                        break;
                    case "/":
                        System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 / num2));
                        break;
                    default:
                        System.out.println(" Something wrong !");

                }
            }
//Задача 2
//Дописать метод калькулятор ( см. код занятия, класс Practice),
// который в зависимости от ввода пользователя
// выполняет сложение, вычитание, умножение или деление.
// Пользователь вводит оба числа, затем знак операции (+, -, * или /).
// В зависимости от введенного знака программа выполняет выбранное действие
// и выводит полученный результат на экран.
        }
    }