package hwLesson19.entity;

public class Book {
    private int ID;
    private String bookName;
    private String author;
    private String genre;

    public Book(int ID, String bookName, String author, String genre) {
        this.ID = ID;
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
    }

    public int getID() {
        return ID;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book ID=" + ID +
                ", Book Name='" + bookName + '\'' +
                ", Author='" + author + '\'' +
                ", Genre='" + genre + '\'' +
                '}';
    }
}
