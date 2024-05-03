package code.library.var2;

public class BookApp {
    public static void main(String[] args) {
        BookService service = new BookService();


        Book[] ourLibrary = service.createLibrary();


        for (int i = 0; i < ourLibrary.length; i++) {

            System.out.println(ourLibrary[i]);

        }

    }
}
