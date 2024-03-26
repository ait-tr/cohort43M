package ait.book;

import book.model.Book;

public class BookAppl {
    public static void main(String[] args) {

        Book book1 = new Book(167283, "English", "Leon Stil", 2012);
        book1.display();
        Book book2 = new Book(234562,"Cuba", 2023);
        book2.display();

        System.out.println(book1.getIsbn());
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYearOfPublishing());


        System.out.println(book2.getIsbn());
        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getYearOfPublishing());




    }
}
