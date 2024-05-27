package work1;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        String[] arrayBracket = {
                "[[[]]]",
                "()(()(()",
                "{}{{{{}}",
                "{{}}{}"
        };

        for (String arrayElement : arrayBracket ){
            System.out.println(arrayElement + " is correct ? " + isBracket(arrayElement));
        }
    }
    public static boolean isBracket(String string){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (currentChar == '[' || currentChar == '(' || currentChar == '{') {
                stack.push(currentChar);
            } else if (currentChar == ']' || currentChar == ')' || currentChar == '}') {

                if (stack.empty()) {
                    return false;
                }
                char topChar = stack.pop();
            }
        }
        return stack.empty();
    }
}

