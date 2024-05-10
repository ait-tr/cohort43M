package code.task3.entity;

public abstract class MediaItem {

    private int id;
    private String title;
    private String author;
    private int year;

    public MediaItem(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public abstract void printInfo();
}
