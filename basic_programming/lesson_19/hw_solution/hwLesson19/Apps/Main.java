package hwLesson19.Apps;

import hwLesson19.entity.Book;
import hwLesson19.repository.BookResopitory;
import hwLesson19.service.BookService;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        BookResopitory bookResopitory = new BookResopitory(books);
        BookService bookService = new BookService(bookResopitory);

        bookService.addNewBook();
        bookService.addNewBook();
        bookService.addNewBook();
        System.out.println(bookResopitory);
    }
}
