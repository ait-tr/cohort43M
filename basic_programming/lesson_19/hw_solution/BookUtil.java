import java.util.Scanner;

public class BookUtil {
    private Scanner scanner;
    private BookService bookService;
    private int idCounter;

    public BookUtil(BookService bookService) {
        this.scanner = new Scanner(System.in);
        this.bookService = bookService;
        this.idCounter = 1;
    }

    public void addBookManually() {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.print("Введите жанр книги: ");
        String genre = scanner.nextLine();

        Book book = new Book(idCounter++, title, author, genre);
        bookService.addBook(book);
    }
}
