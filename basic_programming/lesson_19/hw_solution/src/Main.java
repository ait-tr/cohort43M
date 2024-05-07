public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[10];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);
        UserInput ui = new UserInput();
        int string = ui.inputInt("Сколько книжек вы хотите добавить ?");
        for (int i = 0; i < string; i++) {
            bookService.addNewBook();
        }
        bookRepository.toString();
        String genre = ui.inputText("Введите жанр книги");

        System.out.println(bookRepository.findByGenre(genre));
    }
}