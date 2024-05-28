package HW_32.task_2;

import java.util.Scanner;

public class BrowserApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum browser history size: ");
        int maxSize = scanner.nextInt();

        BrowserManager browserManager = new BrowserManager(maxSize);

        while (true){
            System.out.println("\nMenu:");
            System.out.println("1. Add page to history");
            System.out.println("2. Delete last visited page");
            System.out.println("3. Вывести историю браузера");
            System.out.println("4. Выход");

            System.out.println("Choose an action: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    browserManager.addPageToHistory();
                    break;
                case 2:
                    browserManager.removeLastPageFromHistory();
                    break;
                case 3:
                    browserManager.printBrowserHistory();
                    break;
                case 4:
                    browserManager.closeScanner();
                    System.out.println("End the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select an action from the menu.");
            }
        }



    }
}
