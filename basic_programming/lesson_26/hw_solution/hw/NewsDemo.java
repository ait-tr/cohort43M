package hw;

public class NewsDemo {
    public static void main(String[] args) {
        NewsFeed repository = new NewsFeed();
        News mainNews = new News(1, "AI is the new global problem for humankind",
                "The scientists are worrying about robot getting their own mind." +
                        " Robots could be killing people or at least trying to manipulate " +
                        "humans will and do everything possible to be unnoticed until human" +
                        " won't get that they are not the one who controls the world");
        repository.addOneNews(mainNews);
        repository.printNews();

    }
}
