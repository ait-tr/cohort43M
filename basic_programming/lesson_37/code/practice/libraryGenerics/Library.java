package code.practice.libraryGenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library<T> {

    private Map<T, List<BookGenerics<T>>> booksByGenre = new HashMap<>();

    public void addBook(BookGenerics<T> bookGenerics) {
        List<BookGenerics<T>> books = getBooksBuGenre(bookGenerics.getGenre());
        books.add(bookGenerics);
        booksByGenre.put(bookGenerics.getGenre(), books);
    }

    public List<BookGenerics<T>> getBooksBuGenre(T genre){
        return booksByGenre.getOrDefault(genre, new ArrayList<>());
    }
}
