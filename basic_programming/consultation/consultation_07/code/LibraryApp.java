package code;

import org.w3c.dom.ls.LSOutput;

public class LibraryApp {
    public static void main(String[] args) {
        CreateLibraryData data = new CreateLibraryData();

        Library library = data.createLibrary();

        library.printDataLibrary();

        System.out.println("==================== ПОИСК КНИГИ ==============");
        library.searchDataLibraryByBookName("Три товарища");
        library.searchDataLibraryByBookName("Три толстяка");

    }
}
