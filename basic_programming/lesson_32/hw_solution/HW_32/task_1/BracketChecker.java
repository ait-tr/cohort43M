package HW_32.task_1;

import java.util.Stack;

public class BracketChecker {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')'|| c == '}' || c == ']' ) {
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (!BracketMatcher.isMatchingPair(top, c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }




}
