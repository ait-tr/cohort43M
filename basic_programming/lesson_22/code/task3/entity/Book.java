package code.task3.entity;

public class Book extends MediaItem{

    private int pageCount;

    public Book(int id, String title, String author, int year, int pageCount) {
        super(id, title, author, year);
        this.pageCount = pageCount;
    }

    @Override
    public void printInfo() {
        System.out.println("Book:" + getTitle() + " " + getAuthor() + " " + getYear() + " " + pageCount);
     }
}
