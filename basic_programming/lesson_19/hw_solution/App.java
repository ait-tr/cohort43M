package book;
public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl() {
            @Override
            void addBook(int id, String title, String author, String genre) {

            }

            @Override
            Book getBookById(int id) {
                return null;
            }

            @Override
            void removeBook(int id) {

            }
        };

        // Example usage
        int id = InputUtil.inputInt("Enter book id: ");
        String title = InputUtil.inputString("Enter book title: ");
        String author = InputUtil.inputString("Enter book author: ");
        String genre = InputUtil.inputString("Enter book genre: ");

        bookService.addBook(id, title, author, genre);
    }
}