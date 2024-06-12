package code.homework37.task1;

public class Demo {
    public static void main(String[] args) {
        Library<Book> myLibrary = new Library<>();
        myLibrary.addBook(new Book("Book1", "Horror"));
        myLibrary.addBook(new Book("Book2", "Novel"));
        myLibrary.addBook(new Book("Book3", "Novel"));
        myLibrary.addBook(new Book("Book4", "Horror"));

        System.out.println(myLibrary.findBookByGenre("Horror"));
        System.out.println(myLibrary.findBookByTitle("Book3"));
    }
}
