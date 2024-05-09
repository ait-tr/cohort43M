package homework.book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void addBook (Book book){
        books.add(book);
    }
    public List<Book> getAllBooks(){
        return books;
    }

    public Book findBookById(int id){
        for (Book book : books){
            if (book.getId() == id){
                return  book;
            }
        }
        return null;
    }

}
