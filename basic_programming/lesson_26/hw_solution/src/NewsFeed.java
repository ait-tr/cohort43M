import java.util.ArrayList;

public class NewsFeed {
    ArrayList<News> news = new ArrayList<>();

    public boolean addNews(News addNews) {
        if (news.contains(addNews)){
            return false;
        }
        else {
            news.add(addNews);
        }
        return true;
    }
    public void showAllNews(){
        for (News newNews : this.news) {
            System.out.println(newNews);
        }
    }
}
