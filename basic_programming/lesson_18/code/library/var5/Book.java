package code.library.var5;

public class Book {

    private String bookName;
    private Author author;
    private int bookPages;
    private String catalogNumber;
    private String genre;

    public Book(String bookName, Author author, int bookPages, String catalogNumber, String genre) {
        this.bookName = bookName;
        this.author = author;
        this.bookPages = bookPages;
        this.catalogNumber = catalogNumber;
        this.genre = genre;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getBookPages() {
        return bookPages;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", bookPages=" + bookPages +
                ", catalogNumber='" + catalogNumber + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
