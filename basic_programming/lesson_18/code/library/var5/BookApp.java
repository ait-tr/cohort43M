package code.library.var5;

public class BookApp {
    public static void main(String[] args) {
        BookService service = new BookService();

        Author[] authors = service.createAllAuthors();

        Book[] ourLibrary = service.createLibrary(authors);


        for (int i = 0; i < ourLibrary.length; i++) {

            System.out.println(ourLibrary[i]);

        }

    }
}
