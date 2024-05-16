package code;

import code.withCollections.entity.Book;

import java.util.Arrays;

public class BookShelf {

    private String idNumber;
    private Book[] books;

    public BookShelf(String idNumber, Book[] books) {
        this.idNumber = idNumber;
        this.books = books;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "idNumber='" + idNumber + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
