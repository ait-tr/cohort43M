package HW_32.task_1;

public class BracketApp {
    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "(]()))";
        String test4 = "([{}])";

        System.out.println(BracketChecker.isValid(test1));
        System.out.println(BracketChecker.isValid(test2));
        System.out.println(BracketChecker.isValid(test3));
        System.out.println(BracketChecker.isValid(test4));

    }
}
