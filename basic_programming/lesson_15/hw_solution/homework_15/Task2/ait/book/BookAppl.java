package ait.book;

import book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book(1, "book1", "author1",1999);
        book1.display();
        Book book2 = new Book(2,"titel2", 1029);
        book2.display();
    }



}
