import java.util.Scanner;

public class Homework8 {


    public static void main(String[] args){
 //1
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number from 1 to 7: ");
        int dayNumber = scanner.nextInt();

        calculator();


       switch (dayNumber) {

           case 1:
               System.out.println("Monday");
               break;

           case 2:
               System.out.println("Tuesday");
               break;

           case 3:
               System.out.println("Wednesday");
               break;

           case 4:
               System.out.println("Thursday");
               break;

           case 5:
               System.out.println("Friday");
               break;

           case 6:
               System.out.println("Saturday");
               break;

           case 7:
               System.out.println("Sunday");
           default:
               System.out.println("Error an invalid number has been entered. Enter 1 to 7");
               break;
       }

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

        switch (sign) {
            case "+":
                System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 + num2));
                break;

            case "-":
                System.out.println(num1 + " " + sign +" " + num2 + " = " +(num1 -num2));
                break;

            case "*":
                System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 * num2));
                break;

            case "/":
                System.out.println(num1 + " " + sign +" " + num2 + " = " +(num1 / num2));
            default:

                    System.out.println("Error ");
                    break;
        }
    }
}



