package HW_43.task_5;

import java.util.Scanner;

public class ExceptionDemo {
    public static int requestPositiveNumber() throws NegativeNumberException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            throw new NegativeNumberException();
        }
        return number;
    }

    public static void main(String[] args) {
        try {
            int number = requestPositiveNumber();
            System.out.println("Entered number is: " + number);
        } catch (NegativeNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
