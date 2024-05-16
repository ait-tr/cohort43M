package code.withCollections.service;

import code.withCollections.entity.Book;
import code.withCollections.entity.BookAndReader;
import code.withCollections.entity.Reader;
import code.withCollections.repository.BookAndReaderRepository;
import code.withCollections.repository.ReaderRepository;

import java.util.List;

public class BookAndReaderService {

    BookAndReaderRepository repository;
    BookService bookService;


    public BookAndReaderService(BookAndReaderRepository repository, BookService bookService) {
        this.repository = repository;
        this.bookService = bookService;
    }

    public boolean addNewRecord(BookAndReader record){


        Book foundedBook = bookService.findById(record.getBookId());

        if (foundedBook == null) {
            System.out.println("Выдать такую книгу невозможно, ее нет в нашей библиотеке!");
            return false;
        }

        Integer readerIdFromRecords = repository.findByBookId(record.getBookId());

        if (readerIdFromRecords > 0) {
            System.out.println("Выдать такую книгу невозможно, она уже на руках!");
            return false;
        }

        boolean addResult = repository.addNewRecord(record);

        if (addResult) {
            System.out.println("Книга успешно выдана");
        } else {
            System.out.println("Книгу выдать не удалось");
        }
        return addResult;
    }


    public


}
