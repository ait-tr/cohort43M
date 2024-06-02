package code.Hw;

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        String[] stringsForTask = {
                "(())",
                "()[][",
                "([]{])",
                "([]{])}",
                "([]{})"
        };

        for (String arrayElement : stringsForTask){
            System.out.println(arrayElement + " is correct? - " + isBracketCorrect(arrayElement));
        }

    }

    public static boolean isBracketCorrect(String stringLine) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stringLine.length(); i++) {
            char currentChar = stringLine.charAt(i);

            if (currentChar == '(') {
                stack.push(currentChar);
            }
            else if (currentChar == ')') {
                if (stack.empty()) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }

            if (currentChar == '[') {
                stack.push(currentChar);
            }
            else if (currentChar == ']') {
                if (stack.empty()) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }

            if (currentChar == '{') {
                stack.push(currentChar);
            }
            else if (currentChar == '}') {
                if (stack.empty()) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}
