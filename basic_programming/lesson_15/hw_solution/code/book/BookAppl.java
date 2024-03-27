package book;

import book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book book1= new Book(234567L,"Java code"," Unknown autor",2015);
        Book book2= new Book(234568L,"Python code"," Alex Petrov",2019);
        Book book3= new Book(234569L,"Home work"," Patrik Smith",2024);
        Book book4= new Book(234560L,"Java"," Bill Gates",2009);

        System.out.println("Book 1:");
        book1.display();

        System.out.println("\nBook 2:");
        book2.display();

        System.out.println("\nBook 3:");
        book3.display();

        System.out.println("\nBook 4:");
        book4.display();
    }

}
