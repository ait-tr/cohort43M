public class APP {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);
        BookUtil bookUtil = new BookUtil(bookService);

        bookUtil.addBookManually();
        bookUtil.addBookManually();
        bookUtil.addBookManually();
        bookUtil.addBookManually();
        bookUtil.addBookManually();
        bookUtil.addBookManually();

        System.out.println("Все книги:");
        for (Book book : bookService.getAllBooks()) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
