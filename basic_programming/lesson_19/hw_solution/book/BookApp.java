package homework.book;


import java.util.List;

public class BookApp {
    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);

        bookService.addBook(1, "Война и мир", "Лев Толстой", "Роман");
        bookService.addBook(2, "Преступление и наказание", "Фёдор Достоевский", "Роман");
        bookService.addBook(3, "1984", "Джордж Оруэлл", "Фантастика");

        List<Book> allBooks = bookService.getAllBooks();
        for (Book book : allBooks){
            System.out.println("ID: " + book.getId() + " , title: " + book.getTitle() + " , author: " + book.getAuthor() + " , genre: " + book.getGenre());


            int searchId = 2;
            Book foundBook = bookService.findBookById(searchId);
            if (foundBook != null) {
                System.out.println("\n Book ID " + searchId + " search: ");
                System.out.println("Title: " + foundBook.getTitle() + " , Author: " + foundBook.getAuthor() + " , genre: " + foundBook.getGenre());

            }
            else {
                System.out.println("\n Book ID " + searchId + " not search ");
            }
        }
    }

}

