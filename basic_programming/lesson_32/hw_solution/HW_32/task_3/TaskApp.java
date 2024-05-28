package HW_32.task_3;

import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add task");
            System.out.println("2. Reverse task order");
            System.out.println("3. Print tasks");
            System.out.println("4. Exit");

            System.out.print("Choose an action: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем лишний символ новой строки после числа

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    taskManager.addTask(task);
                    break;
                case 2:
                    taskManager.reverseTasks();
                    break;
                case 3:
                    taskManager.printTasks();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select an action from the menu.");
            }
        }
    }
}
