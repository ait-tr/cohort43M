package code.var1.service;

import code.var1.entity.Book;
import code.var1.entity.Reader;
import code.var1.repository.ReaderRepository;

import java.util.List;

public class ReaderService {

    private ReaderRepository repository;
    private BookService bookService;

    public ReaderService(ReaderRepository repository, BookService bookService) {
        this.repository = repository;
        this.bookService = bookService;
    }

    public Reader addNewReader(String readerName){
        Reader newReader = new Reader(readerName);
        return repository.add(newReader);
    }

    public Reader findById(Integer readerId){
        return repository.findById(readerId);
    }

    public Reader findByName(String readerName){
        return repository.findByName(readerName);
    }

    public void lendForReader(String title, String readerName){
        Book bookForLend = bookService.findByTitle(title);
        Reader reader = findByName(readerName);

        if (bookForLend != null && reader != null) {
            bookForLend.setReaderId(reader.getReaderId());
            List<Book> readerBooks = reader.getReaderBooks();
            readerBooks.add(bookForLend);
            System.out.println("Книга " + bookForLend + " успешно выдана читателю " + reader.getReaderName());
        }

    }

    public void printReaderInfo(){
        repository.printReaderInfo();
    }
}
