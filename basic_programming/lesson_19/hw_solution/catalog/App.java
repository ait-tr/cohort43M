package catalog;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Repository repository = new Repository();

        Service service = new Service(repository);

        service.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Classic"));
        service.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee", "Classic"));
        service.addBook(new Book(3, "1984", "George Orwell", "Dystopian"));
        service.addBook(new Book(4, "Pride and Prejudice", "Jane Austen", "Romance"));

        System.out.println("All books:");
        List<Book> allBooks = service.getAllBooks();
        for (Book book : allBooks){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Genre: " + book.getGenre());
        }

        System.out.println("\nBooks Sorted By Genre:");
        List<Book> booksSortedByGenre = service.getAllBooksSortedByGenre();
        for (Book book : booksSortedByGenre){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Genre: " + book.getGenre());
        }

    }

}
