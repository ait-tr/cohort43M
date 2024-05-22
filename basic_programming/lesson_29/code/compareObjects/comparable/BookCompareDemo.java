package code.compareObjects.comparable;

import java.util.Set;
import java.util.TreeSet;

public class BookCompareDemo {
    public static void main(String[] args) {
        Set<Book> library = new TreeSet<>();

        library.add(new Book(10, "Book2"));
        library.add(new Book(2, "Book2"));
        library.add(new Book(1, "Book4"));
        library.add(new Book(7, "Book3"));
        library.add(new Book(5, "Book7"));
        library.add(new Book(1, "Book10"));
        library.add(new Book(12, "Book12"));
        library.add(new Book(15, "Book15"));

        for (Book book : library) {
            System.out.println("id = " + book.getId() + ", title = " + book.getTitle());
        }
    }
}
