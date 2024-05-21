package code.var1.service;


import code.var1.entity.Author;
import code.var1.entity.Book;
import code.var1.repository.BookRepository;

import java.util.List;

public class BookService {

    private BookRepository repository;
    private AuthorService authorService;

    public BookService(BookRepository repository, AuthorService authorService) {
        this.repository = repository;
        this.authorService = authorService;
    }

    public Book addNewbook(String isbn, String title, String authorName){

        Author author = authorService.findByName(authorName);
        Book newBook = new Book(isbn,title, author);
        return repository.add(newBook);
    }

    public Book findById(Integer bookId){
        return repository.findById(bookId);
    }

    public Book findByTitle(String  bookTitle){
        return repository.findByTitle(bookTitle);
    }

    public List<Book> findByAuthor(String authorName){
        Author author = authorService.findByName(authorName);
        return repository.findByAuthor(author);
    }


}
