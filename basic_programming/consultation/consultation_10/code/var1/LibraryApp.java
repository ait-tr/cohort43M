package code.var1;

import code.var1.entity.Author;
import code.var1.repository.AuthorRepository;
import code.var1.repository.BookRepository;
import code.var1.repository.ReaderRepository;
import code.var1.service.AuthorService;
import code.var1.service.BookService;
import code.var1.service.ReaderService;

public class LibraryApp {
    public static void main(String[] args) {

        AuthorRepository authorRepository = new AuthorRepository();
        BookRepository bookRepository = new BookRepository();
        ReaderRepository readerRepository = new ReaderRepository();

        AuthorService authorService = new AuthorService(authorRepository);
        BookService bookService = new BookService(bookRepository, authorService);
        ReaderService readerService = new ReaderService(readerRepository, bookService);

        authorService.addNewAuthor(new Author(1, "Джек Лондон"));
        authorService.addNewAuthor( new Author(2, "Томас Манн"));
        authorService.addNewAuthor(new Author(3, "Ремарк"));
        authorService.addNewAuthor(new Author(4, "Пушкин"));
        authorService.addNewAuthor(new Author(5, "Лермонтов"));

        bookService.addNewbook("12345","Зов предков", "Джек Лондон");
        bookService.addNewbook("2345345","Мартен Иден", "Джек Лондон");
        bookService.addNewbook("2452345","Тристан", "Томас Манн");
        bookService.addNewbook("356356","Три товарища", "Ремарк");
        bookService.addNewbook("4567567","На западном фронте без перемен", "Ремарк");
        bookService.addNewbook("56785678","Маленькие трагедии", "Пушкин");
        bookService.addNewbook("7890789","Герой нашего времени", "Лермонтов");
        bookService.addNewbook("9695854","Мцыри", "Лермонтов");

        readerService.addNewReader("Ruslan");
        readerService.addNewReader("Ludmila");
        readerService.addNewReader("Roman");
        readerService.addNewReader("Oleg");

        System.out.println("------ все книги --------");
        bookService.printBooksInfo();

        System.out.println("------ все читатели ------");

        readerService.printReaderInfo();

        System.out.println("------- выдаем книги --------");

        bookService.lendBookToReader("Мцыри",readerService.findByName("Oleg"));
        bookService.lendBookToReader("Тристан",readerService.findByName("Roman"));

        readerService.lendForReader("Три товарища","Ludmila");
        readerService.lendForReader("Маленькие трагедии","Ruslan");

        readerService.lendForReader("Мартен Иден","Oleg");

        System.out.println("------ все книги --------");
        bookService.printBooksInfo();

        System.out.println("------ все читатели ------");

        readerService.printReaderInfo();


    }
}
