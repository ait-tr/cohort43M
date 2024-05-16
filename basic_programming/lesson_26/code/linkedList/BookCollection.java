package code.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class BookCollection {
    public static void main(String[] args) {

        ArrayList<Book> arrayList = new ArrayList<>();
        arrayList.add(new Book("Java"));

        System.out.println(arrayList);


        LinkedList<Book> books = new LinkedList<>();

        books.add(new Book("Три поросенка"));

        System.out.println(books);
    }
}
