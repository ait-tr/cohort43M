package code.library.userInterfase;

import code.withCollections.entity.Book;
import code.withCollections.entity.Reader;
import code.library.service.BookService;
import code.library.service.MagazineService;
import code.library.service.ReaderLendService;
import code.library.service.ReaderService;
import code.library.var1.UserInput;

public class UserInterfaceService {

    UserInput userInput;

    private BookService bookService;
    private MagazineService magazineService;
    private ReaderService readerService;
    private ReaderLendService readerLendService;

    public UserInterfaceService(UserInput userInput, BookService bookService, MagazineService magazineService, ReaderService readerService, ReaderLendService readerLendService) {
        this.userInput = userInput;
        this.bookService = bookService;
        this.magazineService = magazineService;
        this.readerService = readerService;
        this.readerLendService = readerLendService;
    }

    public  void printMenu(){
        System.out.println("======= MENU ========");
        System.out.println("1. Add book");
        System.out.println("2. Add reader");
        System.out.println("3. Find book by Title");
        System.out.println("4. Find books by Author");
        System.out.println("5. Find reader by Id");
        System.out.println("6. Lend book to reader");
        System.out.println("7. Exit");

    }

    public boolean addBook() {
        int id = userInput.inputInt("Enter id: ");
        String title = userInput.inputText("Enter title: ");
        String author = userInput.inputText("Enter author: ");
        String genre = userInput.inputText("Enter genre: ");

        Book newBook = new Book(id, title, author, genre);

        return bookService.addBook(newBook);

    }

    public  boolean addReader() {
        int id = userInput.inputInt("Enter id: ");
        String name = userInput.inputText("Enter name: ");
        return readerService.addReader(new Reader(id, name));
    }

    public Book findBookByTitle() {
        String title = userInput.inputText("Enter title for search : ");
        Book foundedBook = bookService.findByTitle(title);
        return foundedBook;
    }

    public Book[] findBookByAuthor() {
        String author = userInput.inputText("Enter author for search : ");
        Book[] foundedBooks = bookService.findByAuthor(author);
        return foundedBooks;
    }

    public Reader findReaderById() {
        int readerId = userInput.inputInt("Enter reader id for search : ");
        Reader foundedReader = readerService.findById(readerId);
        return foundedReader;
    }


    public boolean makeLend(){
        int readerId = userInput.inputInt("Enter reader id for lend : ");
        String title = userInput.inputText("Enter title for lend :");
        return readerLendService.makeLend(readerId,title);
    }
}
