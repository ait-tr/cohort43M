package hw;

import java.util.ArrayList;

public class NewsFeed {
    private ArrayList<News> allNews = new ArrayList<>();
    public void addOneNews(News newNews){allNews.add(newNews);}
    public void removeOneNews(News deliteNews){allNews.remove(deliteNews);}

    public News findBytitle(String title){
        for (int i = 0; i < allNews.size(); i++) {
            if (allNews.get(i).getTitle().equals(title)) {
                return allNews.get(i);
            }
        }
        return null;
    }

    public News findById(int id){
        for (int i = 0; i < allNews.size(); i++) {
            if (allNews.get(i).getId() == (id)) {
                return allNews.get(i);
            }
        }
        return null;
    }
    public void printNews(){
        System.out.println("****************************************");
        for (int i = 0; i < allNews.size(); i++) {
            System.out.println(allNews.get(i));
        }
    }
}
