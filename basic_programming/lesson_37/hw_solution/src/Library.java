import java.util.ArrayList;
import java.util.List;

public class Library <T extends Book>{

    List <T> books = new ArrayList<>();

    public void addBook(T book) {
        if (book != null) {
            books.add(book);
        }
    }

    public List<T> getBooksByGenre(String genre) {
        List<T> newBooks = new ArrayList<>();
        for (T book : books) {
            if (book.getGenre().equals(genre)) {
                newBooks.add(book);
            }
        }
        return newBooks;
    }
    public T getBooksByTitle(String title) {
        List<T> newListBooks = new ArrayList<>();
        for (T book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
