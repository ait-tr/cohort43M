package code.library.var2;

public class Book {

    private String bookName;
    private Author author;
    private int bookPages;
    private String catalogNumber;

    public Book(String bookName, Author author, int bookPages, String catalogNumber) {
        this.bookName = bookName;
        this.author = author;
        this.bookPages = bookPages;
        this.catalogNumber = catalogNumber;
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

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", bookPages=" + bookPages +
                ", catalogNumber='" + catalogNumber + '\'' +
                '}';
    }
}
