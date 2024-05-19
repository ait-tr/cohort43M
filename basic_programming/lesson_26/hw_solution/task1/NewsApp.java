package homework.task1;

public class NewsApp {
    public static void main(String[] args) {
        NewsFeed newsFeed = new NewsFeed();

        newsFeed.addNews(new News(1, "The Times", "Something happened!"));
        newsFeed.addNews(new News(2, "Spiegel", "Sunny with a chance of rain."));
        newsFeed.addNews(new News(3, "Fokus", "New Java version released. "));

        newsFeed.displayNews();
    }
}
