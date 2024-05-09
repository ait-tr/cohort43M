package book;

public abstract class BookService {
    abstract void addBook(int id, String title, String author, String genre);
    abstract Book getBookById(int id);
    abstract void removeBook(int id);
}
