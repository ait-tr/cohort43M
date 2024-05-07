package catalog;

import java.util.List;

public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void addBook(Book book){
        repository.addBook(book);
    }

    public void removeBook(int id) {
       repository.removeBook(id);
    }

    public Book getBookById(int id){
        return repository.getBookById(id);
    }

    public List<Book> getAllBooks(){
        return repository.getAllBooks();
    }
    public List<Book> getAllBooksSortedByGenre(){
        return  repository.getAllBooksSortedByGenre();
    };
}
