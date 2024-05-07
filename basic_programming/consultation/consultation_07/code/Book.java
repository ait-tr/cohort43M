package code;

public class Book {

    private int catalogNumber;
    private String bookName;
    private Author author;

    public Book(int catalogNumber, String bookName, Author author) {
        this.catalogNumber = catalogNumber;
        this.bookName = bookName;
        this.author = author;
    }

    public int getCatalogNumber() {
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
