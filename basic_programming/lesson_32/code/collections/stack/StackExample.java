package code.collections.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // добавить элементы

        System.out.println("Стек пуст? - " + stack.empty());

        stack.push(10);
        System.out.println(stack);

        stack.push(20);
        System.out.println(stack);

        stack.push(30);
        System.out.println(stack);

        stack.push(40);
        System.out.println(stack);

        System.out.println("Верхний элемент стека: " + stack.peek());

        System.out.println(stack);

        System.out.println("Вытаскиваем верхний элемент стека: " + stack.pop());

        System.out.println(stack);

        System.out.println("Есть ли в кашей коллекции элемент '10'?" + stack.search(100));

    }
}
