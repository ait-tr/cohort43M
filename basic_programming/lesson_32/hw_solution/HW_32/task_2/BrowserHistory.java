package HW_32.task_2;

import java.util.LinkedList;
import java.util.Queue;

class BrowserHistory {
    private Queue<String> history;
    private int maxSize;

    public BrowserHistory(int maxSize) {
        this.history = new LinkedList<>();
        this.maxSize = maxSize;
    }
    public void addPage(String page){
        if (history.size() >= maxSize){
            history.poll();
        }
        history.offer(page);
    }
    public void removeLastPage(){
        if (!history.isEmpty()){
            history.poll();
        }
        else {
            System.out.println("Browser history is empty.");
        }
    }
    public void printHistory(){
        if (!history.isEmpty()) {
            System.out.println("Browser history:");
            for (String page : history) {
                System.out.println(page);
            }
        } else {
            System.out.println("Browser history is empty.");
        }
    }
}
