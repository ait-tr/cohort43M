package Homework_37.task2;

import java.util.*;

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


    public Optional<T> findBookByTitle(String title) {
        for (List<T> books : booksByGenre.values()) {
            for (T book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return Optional.of(book);
                }
            }
        }
        return Optional.empty();
    }
}
