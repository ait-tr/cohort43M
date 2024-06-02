package code.Hw;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        Deque<String> webHistory = new LinkedList<>();

        webHistory.addLast("www.apple.com");
        webHistory.addLast("www.google.com");
        webHistory.addLast("www.yandex.ru");
        System.out.println(webHistory);
        webHistory.removeLast();
        System.out.println(webHistory);
    }
}
