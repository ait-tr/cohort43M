package code.library.userInterfase;

import code.library.service.BookService;
import code.library.service.MagazineService;
import code.library.var1.UserInput;

public class UserInterface {

    UserInput userInput;

    private BookService bookService;
    private MagazineService magazineService;

    public UserInterface(UserInput userInput, BookService bookService, MagazineService magazineService) {
        this.userInput = userInput;
        this.bookService = bookService;
        this.magazineService = magazineService;
    }

    public void start(){
        while (true) {

        }
    }


    public static void printMenu(){
        System.out.println("======= MENU ========");
        System.out.println("1. Add book");
        System.out.println("2. ");
    }
}
