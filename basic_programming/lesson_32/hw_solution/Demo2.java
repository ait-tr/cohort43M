package Homework_32.task2;

public class Demo2 {
    public static void main(String[] args) {
        ReversibleTaskList taskList = new ReversibleTaskList();


        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        taskList.addTask("Task 3");


        taskList.printTasks();


        taskList.reverseTasks();


        taskList.printTasks();
    }
}
