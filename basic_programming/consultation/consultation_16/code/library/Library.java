package code.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    private List<Reader> readers;

    public Library() {
        init();
    }

    private void init() {
        books = new ArrayList<>();
        books.add(new Book("Book1", "Author1", 2021));
        books.add(new Book("Book2", "Author2", 2021));
        books.add(new Book("Book3", "Author3", 2020));
        books.add(new Book("Book4", "Author4", 2023));
        books.add(new Book("Book5", "Author2", 2022));
        books.add(new Book("Book6", "Author1", 2020));
        books.add(new Book("Book7", "Author2", 2021));
        books.add(new Book("Book8", "Author1", 2022));
        books.add(new Book("Book9", "Author4", 2020));
        books.add(new Book("Book10", "Author1", 2023));
        books.add(new Book("Book11", "Author3", 2022));
        books.add(new Book("Book12", "Author3", 2021));



        readers = new ArrayList<>();
        readers.add(new Reader("Reader1", "reader1@gmail.com",true));
        readers.add(new Reader("Reader2", "reader2@gmail.com",false));


        // выдадим несколько книг первому читателю

        List<Book> booksFirstReader = readers.get(0).getBooks();

        booksFirstReader.add(books.get(0));
        booksFirstReader.add(books.get(3));
        booksFirstReader.add(books.get(5));

    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
