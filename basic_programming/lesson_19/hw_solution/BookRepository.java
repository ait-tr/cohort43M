public class BookRepository {
    private static final int numberOfBook = 5;
    private Book[] books;
    private int bookCount;

    public BookRepository() {
        this.books = new Book[numberOfBook];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < numberOfBook) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Достигнуто максимальное количество книг в репозитории.");
        }
    }

    public Book[] getAllBooks() {
        return books;
    }
}
