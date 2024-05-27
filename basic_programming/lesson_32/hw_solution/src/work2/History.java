package work2;

import java.util.LinkedList;
import java.util.Queue;

public class History {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();

        stringQueue.add("Кулинария для чайников");
        stringQueue.add("Как починить телефон ?");
        stringQueue.add("Как работает Enum ?");
        stringQueue.add("Погода на сегодня");

        System.out.println("История Браузера " + stringQueue);

        stringQueue.poll();
        System.out.println("История Браузера " + stringQueue);



    }
}
