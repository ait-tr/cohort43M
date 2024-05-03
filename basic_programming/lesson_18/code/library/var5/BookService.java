package code.library.var5;

public class BookService {

    UserInput ui = new UserInput();


    public Author createAuthor() {
        String author = ui.inputText("Введите автора: ");
        String description = ui.inputText("Введите описание автора: ");

        Author bookAuthor = new Author(author, description);

        return bookAuthor;
    }


    public Author[] createAllAuthors(){
        int numberAuthors = ui.inputInt("Введите общее количество авторов: ");

        Author[] authors = new Author[numberAuthors];

        for (int i = 0; i < authors.length; i++) {
            authors[i] = createAuthor();
        }

        return authors;
    }




    public Book createBook(Author[] authors){

        int authorIndex = ui.inputInt("введите номер автора из списка");

        Author bookAuthor = authors[authorIndex];

       String bookName = ui.inputText("Введите название книги: ");
       int pages = ui.inputInt("Введите количество страниц: ");
       String catalogNumber = ui.inputText("Введите номер по каталогу: ");
       String genre = ui.inputText("Введите жанр: ");

       Book newBook = new Book(bookName,bookAuthor,pages,catalogNumber,genre);

       return newBook;
    }


    public Book[] createLibrary(Author[] authors){
        int totalBooks = ui.inputInt("Введите общее количество книг: ");

        Book[] books = new Book[totalBooks];

        for (int i = 0; i < totalBooks; i++) {
            books[i] = createBook(authors);
        }

        return books;
    }


    public void groupingByGenre(Book[] books) {
        /*
            в результате группировки книг по жанрам мы должны получить массив книг
            в котором каждому индексу будет соответствовать

            Жанр - из списка жанров, где каждый имеет свой порядковый номер (детектив -1,
            драма -2, классика -3 ...)
            И тогда массив книг
            [ [массив книг у которых жанр - детектив], [массив книг у которых жанр - драма],[...] ]

         */
    }

}
