package hwLesson19.repository;

import hwLesson19.entity.Book;

import java.util.Arrays;

public class BookResopitory {
    private Book[] books;

    public BookResopitory(Book[] books) {
        this.books = books;
    }

    public void add(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    public Book findByID(int ID) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getID() == ID) {
                return books[i];
            }
        }
        return null;
    }

    public Book findByName(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(bookName)) {
                return books[i];
            }
        }
        return null;
    }

    public Book findByGenre(String genre) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getGenre().equals(genre)) {
                return books[i];
            }
        }
        return null;

    }

    public Book findByAuthor(String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                return books[i];
            }
        }
        return null;

    }

    @Override
    public String toString() {
        return "BookResopitory{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
