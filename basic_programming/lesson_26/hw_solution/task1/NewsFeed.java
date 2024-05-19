package homework.task1;

import java.util.LinkedList;

public class NewsFeed {

    private LinkedList<News> newList;

    public NewsFeed(){
        newList = new LinkedList<>();
    }

    public void addNews(News news){
        newList.addFirst(news);
    }

    public void displayNews(){
        for (News news : newList){
            System.out.println(news);
        }
    }


}
