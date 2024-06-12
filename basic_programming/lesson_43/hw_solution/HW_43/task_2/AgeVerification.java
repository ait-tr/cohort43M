package HW_43.task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer age = 0;

        while (age <= 0) {
            try {
                System.out.println("Enter your age: ");
                age = scanner.nextInt();

                if (age <= 0) {
                    System.out.println("Age must be a positive number. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid data entered. Please enter only whole numbers.");
                scanner.next();
            }
        }

        System.out.println("Your age: " + age);
        scanner.close();
    }
}

