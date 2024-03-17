import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задача 2

        calculator();
        weekdays();
    }

    public static void calculator (){
        double num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter first number:");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        String trash = scanner.nextLine();
        System.out.println("trash is" + trash + " end of trash");

        System.out.print("Enter sign (+,-,*,/): ");
        String sing = scanner.nextLine();

        switch (sing)
        {
            case  "+":
                System.out.println(num1 + " " + sing + " " + num2 + " = " + (num1 + num2));
                break;

            case  "-":
                System.out.println(num1 +" " + sing + " " + num2 + " = " + (num1-num2));
                break;

            case  "*":
                System.out.println(num1 + " " + sing + " " + num2 + " = " + (num1 * num2));
                break;

            case  "/":
                System.out.println(num1 + " " + sing + " " + num2 + " = " + (num1 / num2));
                break;

           default:
                System.out.println("Wrong sign");
                System.out.println();

        }

    }


    // Задача 1
    public static void weekdays () {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number:");
        num = scanner.nextInt();


        switch (num)
        {
            case 1:
                System.out.println("The first day of the week is " + " = " + " Monday ");
                break;

            case 2:
                System.out.println("The second day of the week is " + " = " + " Tuesday ");
                break;

            case 3:
                System.out.println("The third day of the week is "  + " = " + " Wednesday ");
                break;

            case 4:
                System.out.println("The fourth day of the week is "  + " = " + " Thursday ");
                break;

            case 5:
                System.out.println("The fifth day of the week is "  + " = " + " Friday ");
                break;

            case 6:
                System.out.println("The sixth day of the week is "  + " = " + " Saturday ");
                break;

            case 7:
                System.out.println("The seventh day of the week is "  + " = " + " Sunday ");
                break;

            default:
                System.out.println("Wrong operation");
                System.out.println();



        }




    }
}
