package Homework_37.task2;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Library<Book> library = new Library<>();


        library.addBook(new Book("To Kill a Mockingbird", "Fiction"));
        library.addBook(new Book("1984", "Fiction"));
        library.addBook(new Book("A Brief History of Time", "Science"));
        library.addBook(new Book("The Art of Computer Programming", "Science"));
        library.addBook(new Book("The Great Gatsby", "Fiction"));


        System.out.println("Fiction books: " + library.getBooksByGenre("Fiction"));
        System.out.println("Science books: " + library.getBooksByGenre("Science"));


        Optional<Book> foundBook = library.findBookByTitle("1984");
        foundBook.ifPresent(book -> System.out.println("Found book: " + book));

        Optional<Book> missingBook = library.findBookByTitle("Nonexistent Book");
        System.out.println("Found nonexistent book: " + missingBook.orElse(null));
    }
}
