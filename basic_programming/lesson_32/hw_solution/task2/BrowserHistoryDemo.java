package homework.task2;

import java.util.Scanner;

public class BrowserHistoryDemo {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        Scanner scanner = new Scanner(System.in);

        String command;

        System.out.println("Добро пожаловать в историю браузера!");
        System.out.println("Команды: visit<url>, back, show, exit");

        while (true){
            System.out.println("Введите команду");
            command = scanner.nextLine();
            String[] parts = command.split(" ", 2);
            String action = parts[0];

            switch (action){
                case "visit":
                    if (parts.length > 1){
                        browserHistory.visit(parts[1]);
                    }
                    else {
                        System.out.println("Не верно указан URL");
                    }
                    break;

                case "back":
                    browserHistory.back();
                    break;

                case "show":
                    browserHistory.allShowHistory();
                    break;

                case "exit":
                    System.out.println("Выход");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ошибка ввода команды");
            }
        }
    }
}
