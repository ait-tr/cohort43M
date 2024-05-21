package code.var1.entity;

public class Book {

    private int bookId;
    private String isbn;
    private String title;
    private Author author;
    private Integer readerId;

    public Book( String isbn, String title, Author author) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", readerId=" + readerId +
                '}';
    }
}
