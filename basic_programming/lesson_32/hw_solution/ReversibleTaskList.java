package Homework_32.task2;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class ReversibleTaskList {

    private Deque<String> tasks;

    public ReversibleTaskList() {
        tasks = new ArrayDeque<>();
    }

    public void addTask(String task) {
        tasks.addLast(task);
        System.out.println("Added task: " + task);
    }


    public void reverseTasks() {

        String[] tasksArray = tasks.toArray(new String[0]);
        Collections.reverse(java.util.Arrays.asList(tasksArray));
        tasks.clear();
        Collections.addAll(tasks, tasksArray);
        System.out.println("Tasks reversed");
    }


    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list");
        } else {
            System.out.println("Task list:");
            for (String task : tasks) {
                System.out.println(task);
            }
        }
    }


}
