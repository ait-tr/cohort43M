package HW_32.task_3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class TaskManager {
    private Deque<String> tasks;

    public TaskManager() {
        this.tasks = new ArrayDeque<>();
    }

    public void addTask(String task) {
        tasks.addLast(task);
    }

    public void reverseTasks() {
        Deque<String> reversedTasks = new ArrayDeque<>();
        while (!tasks.isEmpty()) {
            reversedTasks.addLast(tasks.removeLast());
        }
        tasks = reversedTasks;
    }

    public void printTasks() {
        if (!tasks.isEmpty()) {
            System.out.println("Tasks:");
            for (String task : tasks) {
                System.out.println(task);
            }
        } else {
            System.out.println("No tasks available.");
        }
    }
}
