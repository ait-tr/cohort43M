package homework.task3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ReversibleTaskList {
    private Deque<String> tasks;

    public ReversibleTaskList() {
        this.tasks = new ArrayDeque<>();
    }

    public void addTask(String task){
        tasks.addLast(task);
    }

    public void reverseOrder(){
        Deque<String> reversedTasks = new ArrayDeque<>();
        while (!tasks.isEmpty()){
            reversedTasks.addLast(tasks.removeLast());
        }
        tasks = reversedTasks;
    }

    public void printTasks(){
        Iterator<String> iterator = tasks.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
