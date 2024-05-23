package code;

import code.library.var1.UserInput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();

        UserInput userInput = new UserInput();

        String word;

        while (true){
            System.out.println("Program menu:");
            System.out.println("1. Add word");
            System.out.println("2. Show uniq wordss");
            System.out.println("3. Exit");

            int userChoice = userInput.inputInt("Choose an option: ");

            switch (userChoice){
                case 1:
                    word = userInput.inputText("Enter your word: ");

                    if (words.add(word)){
                        System.out.println("Your word added");
                    } else {
                        System.out.println("Your word already exist");
                    }
                    break;

                case 2:

                    System.out.println("Uniq words");
                    for (String currentWord : words){
                        System.out.println(currentWord);
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
