package code.var1.repository;

import code.var1.entity.Author;
import code.var1.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();
    private Integer bookIdCounter = 0;


    public Book add(Book newBook){ //получаем книгу но без id
        newBook.setBookId(++bookIdCounter); //добавили следующий id
        books.add(newBook); // сохранили в коллекцию
        return newBook;
    }

    public Book findById(Integer bookId){
        for (Book book : books){
            if (bookId.equals(book.getBookId())) {
                return book;
            }
        }
        return null;
    }

    public Book findByTitle(String title){
        for (Book book : books){
            if (title.equals(book.getTitle())) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findByAuthor(Author bookAuthor){

        List<Book> foundedBooks = new ArrayList<>();

        for (Book book : books){
            if (book.getAuthor().equals(bookAuthor)) {
                foundedBooks.add(book);
            }
        }
        return foundedBooks;
    }
}
