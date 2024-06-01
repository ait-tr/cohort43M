package homework.task2;

import java.util.LinkedList;

public class BrowserHistory {
    private LinkedList<String> history;

    public BrowserHistory(){
        history = new LinkedList<>();
    }

    public void visit(String url){
        history.addLast(url);
        System.out.println("Посещена страница: " + url);
    }

    public void back(){
        if (!history.isEmpty()){
            String lastVisited = history.removeLast();
            System.out.println("Удалено последнее посещение: " + lastVisited);
        }
        else {
            System.out.println("История пуста");
        }
    }

    public void allShowHistory(){
        if (history.isEmpty()){
            System.out.println("История пуста");
        }
        else {
            System.out.println("История посещения: ");
            for (String url : history){
                System.out.println(url);
            }
        }
    }
}
