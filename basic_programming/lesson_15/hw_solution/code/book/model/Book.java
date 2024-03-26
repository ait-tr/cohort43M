package book.model;

public class Book {
    private long isbn;
    private String title;
    private String author;
    private int yearOfpublishing;
// constructor
    public Book(long isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfpublishing = yearOfpublishing;
    }

    // constructor without an author

    public Book(long isbn, String title, int yearOfpublishing) {
        this.isbn = isbn;
        this.title = title;
        this.yearOfpublishing = yearOfpublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfpublishing() {
        return yearOfpublishing;
    }

    public void setYearOfpublishing(int yearOfpublishing) {
        this.yearOfpublishing = yearOfpublishing;
    }


    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfpublishing=" + yearOfpublishing +
                '}';
    }

    public void display(){
        System.out.println("Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfpublishing=" + yearOfpublishing +
                '}');
    }
}// end of class
