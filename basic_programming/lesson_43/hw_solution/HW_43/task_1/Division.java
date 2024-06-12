package HW_43.task_1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first number: ");
            Double num_1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            Double num_2 = scanner.nextDouble();

            if (num_2 == 0) {
                System.out.println("Error: division by zero is not possible.");
            } else {
                double result = num_1 / num_2;
                System.out.println("Division result:" + result);
            }
            /*
            catch (ArithmeticException e) {
            System.out.println("Error: division by zero is not possible.");
             */

        } catch (Exception e){
            System.out.println("Error: incorrect data entered. Please enter numbers only.");
        } finally {
            scanner.close();
        }




    }
}
