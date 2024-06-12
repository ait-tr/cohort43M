package HW_43.task_3;

import java.util.Scanner;

public class IntegerParsing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            try {
                System.out.println("Enter a string to convert to an integer: ");
                String input = scanner.nextLine();

                int number = Integer.parseInt(input);

                System.out.println("Converted number: " + number);
                break;
            } catch (NumberFormatException e){
                System.out.println("Error: The entered string is not a valid integer. Please try again.");
            }
        }
        scanner.close();
    }
}
