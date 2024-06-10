package code.exceptions;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int number = Integer.parseInt(scanner.nextLine());

            System.out.println(number + " is a " + (99 % number == 0) + " factor of 99 ");
        } catch (NumberFormatException e){
            System.out.println("Wrong format data!" + e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Arithmetic error!" + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception type: " + e.getMessage());
        }
    }
}
