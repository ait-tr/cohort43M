import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
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
        }


    }
}
