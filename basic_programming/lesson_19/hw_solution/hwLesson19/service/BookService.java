package hwLesson19.service;

import hwLesson19.entity.Book;
import hwLesson19.entity.UsersInput;
import hwLesson19.repository.BookResopitory;

public class BookService {
    private BookResopitory bookResopitory;
    public BookService(BookResopitory bookResopitory){this.bookResopitory = bookResopitory;}

    public void addNewBook() {
        UsersInput ui = new UsersInput();
        int ID = ui.inputInt("Enter book ID: ");
        String bookName = ui.inputText("Enter book name: ");
        String author = ui.inputText("Enter book author: ");
        String genre = ui.inputText("Enter book genre: ");
        Book newBook = new Book(ID,bookName,author,genre);
        bookResopitory.add(newBook);
    }
    Book findByID(int ID){
        return bookResopitory.findByID(ID);
    }

    Book findByName(String bookName){ return  bookResopitory.findByName(bookName);}
    Book findByAuthor(String author){ return  bookResopitory.findByAuthor(author);}

    Book findByGenre(String genre){ return  bookResopitory.findByGenre(genre);}

}
