package book;

import book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book(1111,"Yes","Pushkin",1826);
        Book book2 = new Book(1112,"Day","Pushkin",1826);
        Book book3 = new Book(1234,"Night",1930);

    book1.display();
    book2.display();
    book3.display();
    book3.setAuthor("Tolstoy");
        System.out.println(book3.toString());
    }
}
