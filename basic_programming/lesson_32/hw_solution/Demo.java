package Homework_32.task1;

import static Homework_32.task1.BracketValidator.isValid;

public class Demo {
    public static void main(String[] args) {
        String test1 = "({[]})";
        String test2 = "({[})";
        String test3 = "({[]})[]{}";

        System.out.println("Test 1: " + isValid(test1)); // true
        System.out.println("Test 2: " + isValid(test2)); // false
        System.out.println("Test 3: " + isValid(test3)); // true
    }
}
