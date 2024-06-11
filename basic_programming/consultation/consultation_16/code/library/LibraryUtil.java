package code.library;

import java.util.Comparator;
import java.util.List;

public class LibraryUtil {

    public List<Book> sortedByYear(List<Book> books){
        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparingInt(Book::getIssueYear))
                .toList();
        return sortedBooks;
    }
}
