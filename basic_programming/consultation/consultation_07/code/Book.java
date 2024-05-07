package code;

public class Book {

    private String catalogNumber;
    private String bookName;
    private Author author;
    private String shelf;
    private String storage;

    public Book(String catalogNumber, String bookName, Author author) {
        this.catalogNumber = catalogNumber;
        this.bookName = bookName;
        this.author = author;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "catalogNumber=" + catalogNumber +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }
}
