package code.library.repository;

import code.library.entity.Book;

public class BookRepository {

    private Book[] books;
    private int count = 0;
    private LibraryRepository libraryRepository;

    public BookRepository(int sizeOurBooks, LibraryRepository libraryRepository) {
        this.books = new Book[sizeOurBooks];
        this.libraryRepository = libraryRepository;
    }

    public void add(Book book){
        if (count < books.length) {
            books[count] = book;
            count++;

           // books[count++] = book; - сперва кладем в массив с индексом count ссылку на книгу, а потом увеличиваем count на 1
           // books[++count] = book;- сперва увеличиваем count на 1, а затем в массив с индексом count записываем ссылку на книгу

            libraryRepository.add(book);
        }
    }

    public Book findByTitle(String titleForSearch){
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equals(titleForSearch)){
                return books[i];
            }
        }
        return null;
    }

    public Book findById(int idForSearch){
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == idForSearch){
                return books[i];
            }
        }
        return null;
    }

    public Book[] findByAuthor(String authorForSearch){
        Book[] booksSearchResult = new Book[count];
        int searchCount = 0;
        for (int i = 0; i < count; i++) {
            if (books[i].getAuthor().equals(authorForSearch)){
                booksSearchResult[searchCount] = books[i];
                searchCount++;
            }
        }
        return booksSearchResult;
    }
}
