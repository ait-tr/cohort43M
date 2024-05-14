package code.library.userInterfase;

import code.library.entity.Book;
import code.library.entity.Reader;
import code.library.var1.UserInput;

import java.util.Arrays;

public class UserInterface {

    private UserInterfaceService service;
    private UserInput userInput;

    public UserInterface(UserInterfaceService service, UserInput userInput) {
        this.service = service;
        this.userInput = userInput;
    }

    public void start() {
        while (true) {
            service.printMenu();

            int choice = userInput.inputInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    boolean addBookResult = service.addBook();

                    if (addBookResult) {
                        System.out.println("Книга добавлена успешно");
                    } else {
                        System.out.println("Ошибка добавления!");
                    }
                    break;

                case 2:
                    boolean addReaderResult = service.addReader();
                    if (addReaderResult) {
                        System.out.println("Читатель добавлен успешно");
                    } else {
                        System.out.println("Ошибка добавления!");
                    }
                    break;


                case 3:
                    Book foundedBook = service.findBookByTitle();
                    if (foundedBook != null) {
                        System.out.println("Книга найдена.");
                        System.out.println(foundedBook);
                    } else {
                        System.out.println("Книги с таким названием нет!");
                    }
                    break;

                case 4:
                    Book[] foundedBooks = service.findBookByAuthor();
                    if (foundedBooks.length > 0) {
                        System.out.println("Книги найдены.");
                        System.out.println(Arrays.toString(foundedBooks));
                    } else {
                        System.out.println("Книги такого автора не найдены!");
                    }
                    break;

                case 5:
                    Reader foundedReader = service.findReaderById();
                    if (foundedReader != null) {
                        System.out.println("Читатель найден.");
                        System.out.println(foundedReader);
                    } else {
                        System.out.println("Читателя с таким id нет!");
                    }
                    break;

                case 7:
                    System.out.println("Exit ...");
                    return;

            }

        }
    }
}
