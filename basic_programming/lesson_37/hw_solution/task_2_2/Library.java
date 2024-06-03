package code.practice.task_2_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library<T extends Genre> {
     private Map<T, List<BookGenerics<? extends T>>> booksByGenre = new HashMap<>();

     public void addBook(BookGenerics<? extends T> bookGenerics){
         T genre = bookGenerics.getGenre();
         List<BookGenerics<? extends T>> books = booksByGenre.get(genre);
         if (books == null){
             books = new ArrayList<>();
             booksByGenre.put(genre, books);
         }
         books.add(bookGenerics);
     }

     public List<BookGenerics<? extends T>> findBooksByTitle(String title){
         List<BookGenerics<? extends T>> result = new ArrayList<>();
         for (List<BookGenerics<? extends T>> books : booksByGenre.values()){
             for (BookGenerics<? extends T> book : books) {
                 if (book.getTitle().equalsIgnoreCase(title)) {
                     result.add(book);
                 }
         }
     }
         return result;
     }

    public List<BookGenerics<? extends T>> getBooksByGenre(T genre) {
        return booksByGenre.getOrDefault(genre, new ArrayList<>());
    }
}








