import java.util.Arrays;

public class BookRepository {
    private Book[] book;

    public BookRepository(Book[] book) {
        this.book = book;

    }

    public void add(Book books){
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null){
                book[i] = books;
                return;
            }
            System.out.println("Error");
        }
    }
    public Book findByGenre(String name){
        for (int i = 0; i < book.length; i++) {
            if (book[i].getGenre().equals(name)){
                return book[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "book=" + Arrays.toString(book) +
                '}';
    }
}
