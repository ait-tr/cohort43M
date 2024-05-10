package code.task3.entity;

public class Magazine extends MediaItem{

    private int issueNumber;

    public Magazine(int id, String title, String author, int year, int issueNumber) {
        super(id, title, author, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Magazine:" + getTitle() + " " + getAuthor() + " " + getYear() + " " + issueNumber);
     }
}
