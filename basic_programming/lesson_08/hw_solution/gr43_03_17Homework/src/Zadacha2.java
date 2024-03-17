import java.util.Scanner;

public class Zadacha2 {
        public static void main(String[] args) {
            calculator();
            calculator();
            calculator();
            calculator();
        }

        public static void calculator(){
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

            switch (sign)
            {
                case "+":
                    System.out.println(num1 +" " + sign + " " + num2 + " = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 +" " + sign + " " + num2 + " = " + (num1 - num2));
                    break;
                case "*":
                    System.out.println(num1 +" " + sign + " " + num2 + " = " + (num1 * num2));
                    break;
                case "/":
                    if(num2 != 0) {
                    System.out.println(num1 +" " + sign + " " + num2 + " = " + (num1 / num2));
                    }
                    else{
                        System.out.println("na 0 delut nelzja");
                    }
                    break;
                    default:
                    System.out.println(" ne uzvestnoe znachenue");
            }


        }
    }

