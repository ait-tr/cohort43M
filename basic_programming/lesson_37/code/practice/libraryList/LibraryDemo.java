package code.practice.libraryList;

public class LibraryDemo {
    public static void main(String[] args) {
        Library<String> libraryString = new Library();

        libraryString.addBook(new Book<>("Три мушкетера", "приключения"));
        libraryString.addBook(new Book<>("Три товарища", "роман"));
        libraryString.addBook(new Book<>("Три поросенка", "сказка"));

        System.out.println(libraryString.getBooksBuGenre("сказка"));

        //================================================

        Genre1 genre1 = new Genre1("роман");
        Genre2 genre2 = new Genre2("приключения");
        Genre3 genre3 = new Genre3("сказка");

        Library<Genre> genreLibrary = new Library<>();
        genreLibrary.addBook(new Book<>("Три мушкетера", genre2));
        genreLibrary.addBook(new Book<>("Три товарища", genre1));
        genreLibrary.addBook(new Book<>("Три поросенка", genre3));

        System.out.println(genreLibrary.getBooksBuGenre(genre2));

    }
}
