package code.library.var3;

public class BookApp {
    public static void main(String[] args) {
        BookService service = new BookService();

        Book myFirstBook = service.createBook();

        System.out.println(myFirstBook);
    }
}
