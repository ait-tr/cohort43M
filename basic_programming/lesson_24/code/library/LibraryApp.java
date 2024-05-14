package code.library;

import code.library.entity.Magazine;
import code.library.repository.BookRepository;
import code.library.repository.LibraryRepository;
import code.library.repository.MagazineRepository;
import code.library.repository.ReaderRepository;
import code.library.service.BookService;
import code.library.service.MagazineService;
import code.library.service.ReaderLendService;
import code.library.service.ReaderService;
import code.library.userInterfase.UserInterface;
import code.library.userInterfase.UserInterfaceService;
import code.library.var1.UserInput;

public class LibraryApp {
    public static void main(String[] args) {

        LibraryRepository libraryRepository = new LibraryRepository(10);
        BookRepository bookRepository = new BookRepository(5, libraryRepository);
        MagazineRepository magazineRepository = new MagazineRepository(5, libraryRepository);

        ReaderRepository readerRepository = new ReaderRepository(5);

        BookService bookService = new BookService(bookRepository);
        MagazineService magazineService = new MagazineService(magazineRepository);
        ReaderLendService readerLendService = new ReaderLendService(libraryRepository,readerRepository);
        ReaderService readerService = new ReaderService(readerRepository);


        UserInterfaceService userInterfaceService = new UserInterfaceService(new UserInput(),bookService,magazineService,readerService,readerLendService);

        UserInterface ui = new UserInterface(userInterfaceService, new UserInput());

        ui.start();

    }
}
