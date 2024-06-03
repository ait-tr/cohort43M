package Homework_37.task1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library<T extends Book> {
    private Map<String, List<T>> booksByGenre;

    public Library() {
        booksByGenre = new HashMap<>();
    }


    public void addBook(T book) {
        String genre = book.getGenre();
        List<T> books = booksByGenre.get(genre);
        if (books == null) {
            books = new ArrayList<>();
            booksByGenre.put(genre, books);
        }
        books.add(book);
    }


    public List<T> getBooksByGenre(String genre) {
        return booksByGenre.getOrDefault(genre, new ArrayList<>());
    }


    public T findBookByTitle(String title) {
        for (List<T> books : booksByGenre.values()) {
            for (T book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            }
        }
        return null;
    }
}