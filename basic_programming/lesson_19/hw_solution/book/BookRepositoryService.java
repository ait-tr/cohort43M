package homework.book;


import java.util.List;

public class BookRepositoryService {

    private BookRepository bookRepository;

    public BookRepositoryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Добавление книги
    public void addBook(int id, String title, String author, String genre) {
        Book book = new Book(id, title, author, genre);
        bookRepository.addBook(book);
    }

    // Получение всех книг
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    // Поиск книги по ID
    public Book findBookById(int id) {
        return bookRepository.findBookById(id);
    }

}
