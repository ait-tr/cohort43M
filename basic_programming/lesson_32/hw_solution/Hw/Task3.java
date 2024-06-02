package code.Hw;

import java.util.Deque;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        Deque<String> tasks = new LinkedList<>();
        addTask(tasks, "To do homework");
        addTask(tasks, "Water plant");
        addTask(tasks, "Feed pet");
        print(tasks);
        System.out.println();
        System.out.println("Reversed: ");
        print(reverseDeque(tasks));

    }
    public static Deque<String> addTask(Deque<String> tasks, String task){
        tasks.addLast(task);
        return tasks;
    }
    public static Deque<String> removeTaskFromEnd(Deque<String> tasks){
        tasks.removeLast();
        return tasks;
    }
    public static Deque<String> reverseDeque(Deque<String> tasks){
        Deque<String> reversedDeque = new LinkedList<>();
        while (!tasks.isEmpty()){
            reversedDeque.addFirst(tasks.removeFirst());
        }
        tasks = reversedDeque;
        return tasks;
    }
    public static void print(Deque<String> tasks){
        for (String task: tasks){
            System.out.println(task);
        }
    }
}
