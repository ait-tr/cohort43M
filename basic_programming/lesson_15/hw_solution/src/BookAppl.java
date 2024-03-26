public class BookAppl {
    public static void main(String[] args) {

        Book book = new Book(10293,"Sea","Mitch",1877);
        Book book1 = new Book(59494,"Please",1934);
        Book book2 = new Book(4884,"Word",1899);

        book1.display();
        book2.display();
        book.display();

    }
}
