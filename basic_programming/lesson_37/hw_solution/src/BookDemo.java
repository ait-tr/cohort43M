
public class BookDemo {
    public static void main(String[] args) {

        Library myBook = new Library();

        myBook.addBook(new Book("Влателин колец","приключение"));
        myBook.addBook(new Book("Гарри Поттер","роман"));
        myBook.addBook(new Book("Монстер","ужасы"));
        myBook.addBook(new Book("Три поросенка","сказка"));

        System.out.println(myBook);

        System.out.println(myBook.getBooksByGenre("роман"));
        System.out.println(myBook.getBooksByTitle("Монстер"));
    }
}
