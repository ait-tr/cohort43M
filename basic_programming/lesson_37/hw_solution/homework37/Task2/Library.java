package code.homework37.Task2;


import java.util.*;

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

    public Optional<Book> findBookByTitle(String title) {
        Book foundedBook = null;
        for (List<Book> books : booksByGenre.values()) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    foundedBook = book;
                    return Optional.of(foundedBook);
                }
            }
        }
        return Optional.empty();
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
