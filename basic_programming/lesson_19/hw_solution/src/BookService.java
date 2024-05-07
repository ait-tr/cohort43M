
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addNewBook(){
        UserInput ui = new UserInput();
        int newBookId = ui.inputInt("Введите номер книги ");
        String newBookTitle = ui.inputText("Введите название книги: ");
        String newBookAuthor = ui.inputText("Введите автора : ");
        String newBookGenre = ui.inputText("Введите жанр : ");

        Book book1 = new Book(newBookId, newBookTitle, newBookAuthor, newBookGenre);
        bookRepository.add(book1);
    }
}
