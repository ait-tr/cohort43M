package code.practice.librarySimple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibrarySimple {

    private Map<String, List<Book>> booksByGenre = new HashMap<>();

    public void addBook(Book book){
        List<Book> books = booksByGenre(book.getGenre());
        if (books == null) {
            books = new ArrayList<>();
            booksByGenre.put(book.getGenre(), books);
        }

        books.add(book);
    }

    public List<Book> booksByGenre(String genre) {
        return booksByGenre.get(genre);
    }


}
