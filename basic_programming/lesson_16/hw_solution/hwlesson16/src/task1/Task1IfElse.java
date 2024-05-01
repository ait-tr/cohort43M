package task1;

import java.util.Scanner;

public class Task1IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: 1, 2 or 3");
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println("You entered number 1");
        }
        else if (number == 2) {
             System.out.println("You entered number 2");
        }
        else if (number == 3) {
            System.out.println("You entered number 3");
        }
        else {
            System.out.println("Error. Enter number 1, 2 or 3");
        }
    }
}
