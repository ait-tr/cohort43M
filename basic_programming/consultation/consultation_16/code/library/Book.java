package code.library;

public class Book {
    private String bookName;
    private String author;
    private Integer issueYear;

    public Book(String bookName, String author, Integer issueYear) {
        this.bookName = bookName;
        this.author = author;
        this.issueYear = issueYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getIssueYear() {
        return issueYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", issueYear=" + issueYear +
                '}';
    }
}
