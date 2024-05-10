package code.task3;

import code.task3.entity.Book;
import code.task3.entity.Magazine;
import code.task3.service.LibraryCatalog;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        catalog.addMediaItem(new Book(1,"The Hobbit", "Tolkien", 1935, 400));
        catalog.addMediaItem(new Magazine(2,"National Geographic", "-----", 2023, 14));

        catalog.printAllItems();


    }
}
