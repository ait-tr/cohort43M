package book.ait;

import book.model.Book;

public class BookAppl {
    public static void main(String[] args) {

        Book c1 = new Book(234567890, "The Little Prince", 2023);
        Book c2 = new Book(175648392, "Cooking", 2024);
        Book c3 = new Book(564738473, "The Sea", 2022);
        Book c4 = new Book(234564533, "Algorithms", 2021);
        Book c5 = new Book(234567892, "Fairy tales", 2023);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
