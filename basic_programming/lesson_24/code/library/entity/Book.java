package code.library.entity;

public class Book extends LibraryElement{
    private String author;
    private String genre;

    public Book(int id, String title, String author, String genre) {
        super(id, title);
        this.author = author;
        this.genre = genre;
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
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
