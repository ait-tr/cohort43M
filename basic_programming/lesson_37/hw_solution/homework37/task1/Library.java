package code.homework37.task1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library<T> {
    private Map<String, List<Book>> booksByGenre;

    public Library() {
        this.booksByGenre = new HashMap<>();
    }

    public Book addBook(Book book){
        String genre = book.getGenre();
        List<Book> books = booksByGenre.get(genre);

        if (books == null) {
            books = new ArrayList<>();
            booksByGenre.put(genre, books);
        }

        books.add(book);
        return book;
    }

    public Book findBookByTitle(String title) {
        for (List<Book> books : booksByGenre.values()) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    return book;
                }
            }
        }
        return null;
    }

    public List<Book> findBookByGenre(String genre) {
        List<Book> foundedBooksByGenre = new ArrayList<>();
        for (List<Book> books : booksByGenre.values()) {
            for (Book book : books) {
                if (book.getGenre().equals(genre)) {
                    foundedBooksByGenre.add(book);

                }
            }
        }
        return foundedBooksByGenre;
    }
}
