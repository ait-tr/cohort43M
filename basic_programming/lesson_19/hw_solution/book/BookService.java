package homework.book;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(int id, String title, String author, String genre){
        Book book = new Book(id, title, author, genre);
        bookRepository.addBook(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.getAllBooks();
    }

    public Book findBookById(int id){
        return bookRepository.findBookById(id);
    }

}
