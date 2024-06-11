package code.library;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryUtil util = new LibraryUtil();

        System.out.println(util.sortedByYear(library.getBooks()));


        List<Reader> readers = library.getReaders();

        String searchAuthorCriteria = "Author1";

        List<Book> booksByAuthor = readers.stream()
                .flatMap(reader -> reader.getBooks().stream())
                .filter(book -> book.getAuthor().equals(searchAuthorCriteria))
                .toList();

        System.out.println(booksByAuthor);


        // -------- список ВСЕХ книг по авторам -----

        Map<String, List<Book>> allBooksByAuthor = library.getBooks().stream()
                .collect(Collectors.groupingBy(Book::getAuthor));

        System.out.println(allBooksByAuthor);

    }
}
