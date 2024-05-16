package code.withCollections;

import code.withCollections.entity.Book;
import code.withCollections.entity.BookAndReader;
import code.withCollections.entity.Reader;
import code.withCollections.repository.BookAndReaderRepository;
import code.withCollections.repository.BookRepository;
import code.withCollections.repository.ReaderRepository;
import code.withCollections.service.BookAndReaderService;
import code.withCollections.service.BookService;
import code.withCollections.service.ReaderService;

public class LibraryApp {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        ReaderRepository readerRepository = new ReaderRepository();
        BookService bookService = new BookService(bookRepository);
        ReaderService readerService = new ReaderService(readerRepository);

        BookAndReaderRepository repository = new BookAndReaderRepository();
        BookAndReaderService service = new BookAndReaderService(repository, bookService);

        for (int i = 0; i < 50; i++) {
            Book newBook = bookService.createBook();
            bookService.addNewBook(newBook);
        }

        for (int i = 0; i < 10; i++) {
            Reader newReader = readerService.createReader();
            readerService.addNewReader(newReader);
        }

        Integer bookId = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {

                BookAndReader newRecord = new BookAndReader(bookId,i+1);
                service.addNewRecord(newRecord);
                bookId++;
            }
        }


        bookService.printInfo();

        readerService.printInfo();

        service.printInfo();

        System.out.println(service.findAllBookFromReader(readerService.findById(10)));
    }
}
