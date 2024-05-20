package code.homeWork;

import java.util.LinkedList;

public class NewsFeed {


    LinkedList<News> newsList = new LinkedList<>();

    public NewsFeed() {
        this.newsList = new LinkedList<>();
    }


    public void addNews(News news1) {
        newsList.addFirst(new News("", "", ""));
    }

    public void showAllNews() {
        for (News news : newsList) {
            System.out.println("ID: " + news.getId());
            System.out.println("Title: " + news.getTitle());
            System.out.println("Content: " + news.getContent());
            System.out.println();
        }

    }
    public static void main(String[] args) {
        NewsFeed newsFeed = new NewsFeed();

        News news1 = new News("1", "Новость 1", "Содержание новости 1");
        News news2 = new News("2", "Новость 2", "Содержание новости 2");
        News news3 = new News("3", "Новость 3", "Содержание новости 3");

        newsFeed.addNews(news1);
        newsFeed.addNews(news2);
        newsFeed.addNews(news3);

        newsFeed.showAllNews();
    }

}













