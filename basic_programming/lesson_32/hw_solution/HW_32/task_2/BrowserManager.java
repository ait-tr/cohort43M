package HW_32.task_2;

import java.util.Queue;
import java.util.Scanner;

public class BrowserManager {
    private BrowserHistory browserHistory;
    private Scanner scanner;

    public BrowserManager(int maxSize) {
        this.browserHistory = new BrowserHistory(maxSize);
        this.scanner = new Scanner(System.in);
    }

    public void addPageToHistory(){
        System.out.println("Enter page link: ");
        String page = scanner.nextLine();
        browserHistory.addPage(page);
    }
    public void removeLastPageFromHistory(){
        browserHistory.removeLastPage();
    }
    public void printBrowserHistory(){
        browserHistory.printHistory();
    }
    public void closeScanner(){
        scanner.close();
    }
}
