package code.library.service;

import code.library.entity.Book;
import code.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public boolean addBook(Book book) {

        if (book.getId() > 0
                && !book.getAuthor().isBlank()
                && !book.getTitle().isBlank()
                && !book.getGenre().isBlank()) {
            boolean addResult = repository.add(book);
            return addResult;
        } else {
            return false;
        }
    }

    public Book findById(int id){
        return repository.findById(id);
    }

    public Book findByTitle(String title){
        return repository.findByTitle(title);
    }
    public Book[] findByAuthor(String author){
        return repository.findByAuthor(author);
    }


}
