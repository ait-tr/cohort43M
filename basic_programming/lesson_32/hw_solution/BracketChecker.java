package HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketChecker {
    public static boolean isCorrect(String s){
        Map<Character,Character> bracketMap = new HashMap<>();
        bracketMap.put('(',')');
        bracketMap.put('[',']');
        bracketMap.put('{','}');

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(bracketMap.containsKey(ch)){
                stack.push(ch);
            } else if (bracketMap.containsValue(ch)) {
                if (stack.isEmpty() || bracketMap.get(stack.pop()) !=ch){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testString1 = "{[()()()][]}";
        String testString2 = "{[(])}}";
        String testString3 = "][]{}";

        System.out.println("String "+ testString1+ " is correct: "+isCorrect(testString1));
        System.out.println("String "+ testString2+ " is correct: "+isCorrect(testString2));
        System.out.println("String "+ testString3+ " is correct: "+isCorrect(testString3));
    }
}
