public class NewsApp {
    public static void main(String[] args) {
        News news = new News(1,"Шторм","Высокая угроза");
        News news1 = new News(2,"Торнадо","Высокая угроза");
        News news2 = new News(3,"Цунами","Средния угроза");
        News news3 = new News(4,"Ураган","Низкая угроза");

        NewsFeed newsFeed = new NewsFeed();

        newsFeed.addNews(news);
        newsFeed.addNews(news1);
        newsFeed.addNews(news3);
        newsFeed.addNews(news2);

        newsFeed.showAllNews();




    }
}
