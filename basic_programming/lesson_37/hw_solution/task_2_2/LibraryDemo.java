package code.practice.task_2_2;

public class LibraryDemo {
    public static void main(String[] args) {
        Library<Genre> genreLibrary = new Library<>();

        Genre1 genre1 = new Genre1("роман");
        Genre2 genre2 = new Genre2("приключения");
        Genre3 genre3 = new Genre3("сказка");

        genreLibrary.addBook(new BookGenerics<>("Три мушкетера", genre2));
        genreLibrary.addBook(new BookGenerics<>("Три товарища", genre1));
        genreLibrary.addBook(new BookGenerics<>("Три поросенка", genre3));

        System.out.println("Books of genre 'приключения': " + genreLibrary.getBooksByGenre(genre2));
        System.out.println("Books with title 'Три мушкетера': " + genreLibrary.findBooksByTitle("Три мушкетера"));

    }
}

