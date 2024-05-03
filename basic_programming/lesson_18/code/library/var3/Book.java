package code.library.var3;

public class Book {

    private String bookName;
    private int bookPages;
    private String bookDescription;

    public Book(String bookName, int bookPages, String bookDescription) {
        this.bookName = bookName;
        this.bookPages = bookPages;
        this.bookDescription = bookDescription;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookPages() {
        return bookPages;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPages=" + bookPages +
                ", bookDescription='" + bookDescription + '\'' +
                '}';
    }
}
