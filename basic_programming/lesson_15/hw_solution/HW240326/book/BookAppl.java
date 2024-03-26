package HW240326.book;

import HW240326.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book(1278327812, "Jungle book", "Rudyard Kipling", 1894);
        Book book2 = new Book(5557837812l, "Thinking in Java", 1998);

        book1.display();
        book2.display();

    }
}
