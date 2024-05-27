package code.collections.deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        // а могли бы использовать класс ArrayDeque

        // добавим элементы
        deque.addFirst(1); // добавим в начало
        System.out.println("Deque после добавления элементов: " + deque);

        deque.addLast(2); // добавим в конец
        System.out.println("Deque после добавления элементов: " + deque);

        deque.addFirst(0); // добавим в начало
        System.out.println("Deque после добавления элементов: " + deque);

        deque.addLast(3); // добавим в конец

        System.out.println("Deque после добавления элементов: " + deque);

        // просмотр элементов без удаления из коллекции

        System.out.println("Первый элемент: " + deque.peekFirst());
        System.out.println("Последний элемент: " + deque.peekLast());


        // удаление элементов

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println("Deque после удаления элементов: " + deque);


        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println("Deque после удаления элементов: " + deque);

        System.out.println(deque.pollLast());

        System.out.println("Наша коллекция пуста? " + deque.isEmpty());


    }
}
