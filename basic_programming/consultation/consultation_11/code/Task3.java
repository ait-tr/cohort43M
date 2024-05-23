package code;

import code.library.var1.UserInput;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        UserInput userInput = new UserInput();

        Integer number;

        while (true){
            System.out.println("Program menu:");
            System.out.println("1. Add number");
            System.out.println("2. Show sorted numbers");
            System.out.println("3. Exit");

            int userChoice = userInput.inputInt("Choose an option: ");

            switch (userChoice){
                case 1:
                    number = userInput.inputInt("Enter your number: ");
                    numbers.add(number);
                    System.out.println("Your number added");
                    break;

                case 2:
                    System.out.println("Sorted numbers");
                    for (Integer currentNumber : numbers){
                        System.out.println(currentNumber);
                    }
                    break;
                case 3:

                    System.out.println("Exit....");
                    return;

                default:
                    System.out.println("Invalid choice");

            }




        }
    }
}
