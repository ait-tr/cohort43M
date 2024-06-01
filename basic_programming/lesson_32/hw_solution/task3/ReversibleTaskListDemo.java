package homework.task3;

public class ReversibleTaskListDemo {
    public static void main(String[] args) {

        ReversibleTaskList reversibleTaskList = new ReversibleTaskList();

        reversibleTaskList.addTask("Task 1");
        reversibleTaskList.addTask("Task 2");
        reversibleTaskList.addTask("Task 3");
        reversibleTaskList.addTask("Task 4");
        reversibleTaskList.addTask("Task 5");

        System.out.println("Tasks in original order:");
        reversibleTaskList.printTasks();

        reversibleTaskList.reverseOrder();

        System.out.println("Tasks in reversed order:");
        reversibleTaskList.printTasks();
    }
}
