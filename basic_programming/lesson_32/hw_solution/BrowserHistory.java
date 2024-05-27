package HomeWork;

import java.util.LinkedList;

public class BrowserHistory {
    private LinkedList<String> history;

    public BrowserHistory() {
        history= new LinkedList<>();
    }
    public void addLink(String url){
        history.addLast(url);
    }
    public void removeLastVisited(){
        if(!history.isEmpty()){
            history.removeLast();
        }else{
            System.out.println("History is empty. No pages to remove.");
        }
    }

    public LinkedList<String> getHistory() {
        return history;
    }
    public void clearHistory(){
        history.clear();
    }
    public boolean findLink(String url){
        return history.contains(url);
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.addLink("http://example.com");
        browserHistory.addLink("http://google.com");
        browserHistory.addLink("http://github.com");
        browserHistory.addLink("http://ait-tr.de");

        System.out.println("Current history: "+ browserHistory.getHistory());

        browserHistory.removeLastVisited();
        System.out.println("After removing last visited: "+browserHistory.getHistory());

        String urlToFind = "http://ait-tr.de";
        if(browserHistory.findLink(urlToFind)) {
            System.out.println(urlToFind + " is in the history.");
        }else{
            System.out.println(urlToFind+" is not in the history.");
        }
        browserHistory.clearHistory();
        System.out.println("After clearing history: "+browserHistory.getHistory());
    }
}
