package code.collections.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo2 {
    public static void main(String[] args) {

        Queue<Integer> integerQueue = new LinkedList<>();

        // добавим новые элементы в очередь

        integerQueue.add(1);
        integerQueue.offer(2);
        integerQueue.offer(3);

        System.out.println("Очередь после добавления элементов: " + integerQueue);

// посмотреть, но НЕ УДАЛЯТЬ из коллекции

        Integer head = integerQueue.peek();
        System.out.println("Головной элемент: " + head);
        System.out.println("Очередь элементов: " + integerQueue);

        // вытаскиваем из коллекции элемент с его удалением из коллекции

        while (!integerQueue.isEmpty()){
            System.out.println("Вытащен и удален из коллекции элемент: " + integerQueue.poll());
            System.out.println("Очередь элементов: " + integerQueue);

        }

        //System.out.println(integerQueue.poll());
    }
}
