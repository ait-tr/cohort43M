package code.practice.librarySimple;

public class LibrarySimpleDemo {
    public static void main(String[] args) {
        LibrarySimple librarySimple = new LibrarySimple();

        librarySimple.addBook(new Book("Три мушкетера", "приключения"));
        librarySimple.addBook(new Book("Три товарища", "роман"));
        librarySimple.addBook(new Book("Три поросенка", "сказка"));

        System.out.println(librarySimple.booksByGenre("сказка"));

    }
}
