import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:");
        num1 = scanner.nextDouble();
        System.out.println("Enter a second number:");
        num2 = scanner.nextDouble();
        String trash = scanner.nextLine();
        System.out.println("Enter a sign (+, -, *, / ):");
        String sign = scanner.nextLine();
        switch(sign){
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
                if (num2 != 0) {
                System.out.println(num1 + " " + sign + " " + num2 + " = " +(num1 / num2));}
                else { System.out.print (" it's not allowed to divide to 0 ");}
                break;
            default:
                System.out.println("Wrong sign. Please enter a sign (+, -, *, / )");



        }
    }

}
