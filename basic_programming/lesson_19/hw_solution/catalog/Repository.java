package catalog;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Repository {
    private List<Book> books;

    public Repository() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    };
    public void removeBook(int id){
        books.removeIf(book -> book.getId() == id);
    };
    public Book getBookById(int id){
        for (Book book : books){
            if (book.getId() == id){
                return book;
            }
        }
       return null;
    }
    public List<Book> getAllBooks(){
        return books;
    }

    public List<Book> getAllBooksSortedByGenre() {
        List<Book> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks, Comparator.comparing(Book::getGenre));
        return sortedBooks;
    }
}
