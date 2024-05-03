package code.library.var1;

import java.util.Scanner;

public class BookService {

    UserInput ui = new UserInput();

    public Book createBook(){

       String author = ui.inputText("Введите автора: ");
       String bookName = ui.inputText("Введите название книги: ");
       int pages = ui.inputInt("Введите количество страниц: ");
       String catalogNumber = ui.inputText("Введите номер по каталогу: ");

       Book newBook = new Book(bookName,author,pages,catalogNumber);

       return newBook;
    }

}
